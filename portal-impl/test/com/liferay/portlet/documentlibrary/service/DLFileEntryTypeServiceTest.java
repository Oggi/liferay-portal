/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.documentlibrary.service;

import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.service.BaseServiceTestCase;
import com.liferay.portal.util.TestPropsValues;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFileEntryType;
import com.liferay.portlet.documentlibrary.model.DLFileEntryTypeConstants;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.util.DLUtil;

import java.util.List;

/**
 * @author Alexander Chow
 */
public class DLFileEntryTypeServiceTest extends BaseServiceTestCase {

	@Override
	public void setUp() throws Exception {
		super.setUp();

		_folder = DLAppLocalServiceUtil.addFolder(
			TestPropsValues.getUserId(), TestPropsValues.getGroupId(),
			DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Folder A", "",
			getServiceContext());

		_subfolder = DLAppLocalServiceUtil.addFolder(
			TestPropsValues.getUserId(), TestPropsValues.getGroupId(),
			_folder.getFolderId(), "SubFolder AA", "", getServiceContext());

		_basicDocumentDLFileEntryType =
			DLFileEntryTypeLocalServiceUtil.getFileEntryType(
				DLFileEntryTypeConstants.FILE_ENTRY_TYPE_ID_BASIC_DOCUMENT);

		_dlFileEntryTypes =
			DLFileEntryTypeLocalServiceUtil.getFileEntryTypes(
				DLUtil.getGroupIds(TestPropsValues.getGroupId()));

		for (DLFileEntryType dlFileEntryType : _dlFileEntryTypes) {
			String name = dlFileEntryType.getName();

			if (name.equals(DLFileEntryTypeConstants.NAME_IMAGE)) {
				_imageDLFileEntryType = dlFileEntryType;
			}
			else if (name.equals(DLFileEntryTypeConstants.NAME_VIDEO)) {
				_videoDLFileEntryType = dlFileEntryType;
			}
		}

		assertNotNull(
			DLFileEntryTypeConstants.NAME_BASIC_DOCUMENT + " cannot be null",
			_basicDocumentDLFileEntryType);
		assertNotNull(
			DLFileEntryTypeConstants.NAME_IMAGE + " cannot be null",
			_imageDLFileEntryType);
		assertNotNull(
			DLFileEntryTypeConstants.NAME_VIDEO + " cannot be null",
			_videoDLFileEntryType);
	}

	@Override
	public void tearDown() throws Exception {
		super.tearDown();

		DLAppLocalServiceUtil.deleteFolder(_folder.getFolderId());
	}

	public void testFileEntryTypeRestrictions() throws Exception {

		// Configure folder

		DLFolderLocalServiceUtil.updateFolder(
			_folder.getFolderId(), _folder.getParentFolderId(),
			_folder.getName(), _folder.getDescription(),
			_imageDLFileEntryType.getPrimaryKey(),
			ListUtil.toList(
				new long[] {
					_imageDLFileEntryType.getPrimaryKey(),
					_videoDLFileEntryType.getPrimaryKey()
				}),
			true, getServiceContext());

		// Add file to folder

		String name = "Test.txt";
		byte[] bytes = _CONTENT.getBytes();

		FileEntry fileEntry = DLAppServiceUtil.addFileEntry(
			TestPropsValues.getGroupId(), _folder.getFolderId(), name,
			ContentTypes.TEXT_PLAIN, name, "", "", bytes, getServiceContext());

		assertFileEntryType(fileEntry, _imageDLFileEntryType);

		// Add file to subfolder

		fileEntry = DLAppServiceUtil.addFileEntry(
			TestPropsValues.getGroupId(), _subfolder.getFolderId(), name,
			ContentTypes.TEXT_PLAIN, name, "", "", bytes, getServiceContext());

		assertFileEntryType(fileEntry, _imageDLFileEntryType);

		// Configure subfolder

		DLFolderLocalServiceUtil.updateFolder(
			_subfolder.getFolderId(), _subfolder.getParentFolderId(),
			_subfolder.getName(), _subfolder.getDescription(),
			_basicDocumentDLFileEntryType.getPrimaryKey(),
			ListUtil.toList(
				new long[] {_basicDocumentDLFileEntryType.getPrimaryKey()}),
			true, getServiceContext());

		fileEntry = DLAppServiceUtil.getFileEntry(fileEntry.getFileEntryId());

		assertFileEntryType(fileEntry, _basicDocumentDLFileEntryType);
	}

	protected void assertFileEntryType(
		FileEntry fileEntry, DLFileEntryType dlFileEntryType) {

		DLFileEntry dlFileEntry = (DLFileEntry)fileEntry.getModel();

		assertEquals(
			"File should be of file entry type " +
				dlFileEntryType.getFileEntryTypeId(),
			dlFileEntryType.getPrimaryKey(), dlFileEntry.getFileEntryTypeId());
	}

	private static final String _CONTENT =
		"Content: Enterprise. Open Source. For Life.";

	private DLFileEntryType _basicDocumentDLFileEntryType;
	private List<DLFileEntryType> _dlFileEntryTypes;
	private Folder _folder;
	private DLFileEntryType _imageDLFileEntryType;
	private Folder _subfolder;
	private DLFileEntryType _videoDLFileEntryType;

}