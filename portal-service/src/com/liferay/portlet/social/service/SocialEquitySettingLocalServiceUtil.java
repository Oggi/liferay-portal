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

package com.liferay.portlet.social.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the social equity setting local service. This utility wraps {@link com.liferay.portlet.social.service.impl.SocialEquitySettingLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SocialEquitySettingLocalService
 * @see com.liferay.portlet.social.service.base.SocialEquitySettingLocalServiceBaseImpl
 * @see com.liferay.portlet.social.service.impl.SocialEquitySettingLocalServiceImpl
 * @generated
 */
public class SocialEquitySettingLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.social.service.impl.SocialEquitySettingLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the social equity setting to the database. Also notifies the appropriate model listeners.
	*
	* @param socialEquitySetting the social equity setting
	* @return the social equity setting that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.social.model.SocialEquitySetting addSocialEquitySetting(
		com.liferay.portlet.social.model.SocialEquitySetting socialEquitySetting)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSocialEquitySetting(socialEquitySetting);
	}

	/**
	* Creates a new social equity setting with the primary key. Does not add the social equity setting to the database.
	*
	* @param equitySettingId the primary key for the new social equity setting
	* @return the new social equity setting
	*/
	public static com.liferay.portlet.social.model.SocialEquitySetting createSocialEquitySetting(
		long equitySettingId) {
		return getService().createSocialEquitySetting(equitySettingId);
	}

	/**
	* Deletes the social equity setting with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param equitySettingId the primary key of the social equity setting
	* @throws PortalException if a social equity setting with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSocialEquitySetting(long equitySettingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSocialEquitySetting(equitySettingId);
	}

	/**
	* Deletes the social equity setting from the database. Also notifies the appropriate model listeners.
	*
	* @param socialEquitySetting the social equity setting
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSocialEquitySetting(
		com.liferay.portlet.social.model.SocialEquitySetting socialEquitySetting)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSocialEquitySetting(socialEquitySetting);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.liferay.portlet.social.model.SocialEquitySetting fetchSocialEquitySetting(
		long equitySettingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSocialEquitySetting(equitySettingId);
	}

	/**
	* Returns the social equity setting with the primary key.
	*
	* @param equitySettingId the primary key of the social equity setting
	* @return the social equity setting
	* @throws PortalException if a social equity setting with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.social.model.SocialEquitySetting getSocialEquitySetting(
		long equitySettingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSocialEquitySetting(equitySettingId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the social equity settings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of social equity settings
	* @param end the upper bound of the range of social equity settings (not inclusive)
	* @return the range of social equity settings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialEquitySetting> getSocialEquitySettings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSocialEquitySettings(start, end);
	}

	/**
	* Returns the number of social equity settings.
	*
	* @return the number of social equity settings
	* @throws SystemException if a system exception occurred
	*/
	public static int getSocialEquitySettingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSocialEquitySettingsCount();
	}

	/**
	* Updates the social equity setting in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param socialEquitySetting the social equity setting
	* @return the social equity setting that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.social.model.SocialEquitySetting updateSocialEquitySetting(
		com.liferay.portlet.social.model.SocialEquitySetting socialEquitySetting)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSocialEquitySetting(socialEquitySetting);
	}

	/**
	* Updates the social equity setting in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param socialEquitySetting the social equity setting
	* @param merge whether to merge the social equity setting with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the social equity setting that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.social.model.SocialEquitySetting updateSocialEquitySetting(
		com.liferay.portlet.social.model.SocialEquitySetting socialEquitySetting,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSocialEquitySetting(socialEquitySetting, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	/**
	* Returns all the settings for the social equity action.
	*
	* @param groupId the primary key of the group
	* @param className the class name for the target asset
	* @param actionId the ID of the action
	* @return the settings for the social equity action
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialEquitySetting> getEquitySettings(
		long groupId, java.lang.String className, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEquitySettings(groupId, className, actionId);
	}

	/**
	* Returns all the settings for the social equity action.
	*
	* @param groupId the primary key of the group
	* @param classNameId the ID of the target asset's class
	* @param actionId the ID of the action
	* @return the settings for the social equity action
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.social.model.SocialEquitySetting> getEquitySettings(
		long groupId, long classNameId, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEquitySettings(groupId, classNameId, actionId);
	}

	/**
	* Updates settings for the model (asset type) in the group.
	*
	* <p>
	* This method accepts a list of social equity action mappings. A
	* <code>SocialEquityActionMapping</code> contains both participation and
	* information settings for an action. The
	* <code>SocialEquityActionMapping</code> class is used by the portal to
	* store the default settings for social equity actions.
	* </p>
	*
	* @param groupId the primary key of the group
	* @param className the class name of the target asset
	* @param equityActionMappings the equity action mappings containing the
	settings to be stored
	* @throws PortalException if the group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void updateEquitySettings(long groupId,
		java.lang.String className,
		java.util.List<com.liferay.portlet.social.model.SocialEquityActionMapping> equityActionMappings)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateEquitySettings(groupId, className, equityActionMappings);
	}

	public static SocialEquitySettingLocalService getService() {
		if (_service == null) {
			_service = (SocialEquitySettingLocalService)PortalBeanLocatorUtil.locate(SocialEquitySettingLocalService.class.getName());

			ReferenceRegistry.registerReference(SocialEquitySettingLocalServiceUtil.class,
				"_service");
			MethodCache.remove(SocialEquitySettingLocalService.class);
		}

		return _service;
	}

	public void setService(SocialEquitySettingLocalService service) {
		MethodCache.remove(SocialEquitySettingLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(SocialEquitySettingLocalServiceUtil.class,
			"_service");
		MethodCache.remove(SocialEquitySettingLocalService.class);
	}

	private static SocialEquitySettingLocalService _service;
}