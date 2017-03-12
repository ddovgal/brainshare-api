/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq;


import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import ua.ddovgal.brainshareApi.jooq.tables.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class BrainshareDev extends SchemaImpl {

    /**
     * The reference instance of <code>brainshare_dev</code>
     */
    public static final BrainshareDev BRAINSHARE_DEV = new BrainshareDev();
    private static final long serialVersionUID = -1061200034;
    /**
     * The table <code>brainshare_dev.commentary</code>.
     */
    public final TCommentary COMMENTARY = ua.ddovgal.brainshareApi.jooq.tables.TCommentary.COMMENTARY;

    /**
     * The table <code>brainshare_dev.commentary_mark</code>.
     */
    public final TCommentaryMark COMMENTARY_MARK = ua.ddovgal.brainshareApi.jooq.tables.TCommentaryMark.COMMENTARY_MARK;

    /**
     * The table <code>brainshare_dev.content_data</code>.
     */
    public final TContentData CONTENT_DATA = ua.ddovgal.brainshareApi.jooq.tables.TContentData.CONTENT_DATA;

    /**
     * The table <code>brainshare_dev.course</code>.
     */
    public final TCourse COURSE = ua.ddovgal.brainshareApi.jooq.tables.TCourse.COURSE;

    /**
     * The table <code>brainshare_dev.generic_notification</code>.
     */
    public final TGenericNotification GENERIC_NOTIFICATION = ua.ddovgal.brainshareApi.jooq.tables.TGenericNotification.GENERIC_NOTIFICATION;

    /**
     * The table <code>brainshare_dev.in_commentary_moderator_request</code>.
     */
    public final TInCommentaryModeratorRequest IN_COMMENTARY_MODERATOR_REQUEST = ua.ddovgal.brainshareApi.jooq.tables.TInCommentaryModeratorRequest.IN_COMMENTARY_MODERATOR_REQUEST;

    /**
     * The table <code>brainshare_dev.material</code>.
     */
    public final TMaterial MATERIAL = ua.ddovgal.brainshareApi.jooq.tables.TMaterial.MATERIAL;

    /**
     * The table <code>brainshare_dev.material_attachment</code>.
     */
    public final TMaterialAttachment MATERIAL_ATTACHMENT = ua.ddovgal.brainshareApi.jooq.tables.TMaterialAttachment.MATERIAL_ATTACHMENT;

    /**
     * The table <code>brainshare_dev.material_format</code>.
     */
    public final TMaterialFormat MATERIAL_FORMAT = ua.ddovgal.brainshareApi.jooq.tables.TMaterialFormat.MATERIAL_FORMAT;

    /**
     * The table <code>brainshare_dev.material_mark</code>.
     */
    public final TMaterialMark MATERIAL_MARK = ua.ddovgal.brainshareApi.jooq.tables.TMaterialMark.MATERIAL_MARK;

    /**
     * The table <code>brainshare_dev.material_recommendation</code>.
     */
    public final TMaterialRecommendation MATERIAL_RECOMMENDATION = ua.ddovgal.brainshareApi.jooq.tables.TMaterialRecommendation.MATERIAL_RECOMMENDATION;

    /**
     * The table <code>brainshare_dev.material_state</code>.
     */
    public final TMaterialState MATERIAL_STATE = ua.ddovgal.brainshareApi.jooq.tables.TMaterialState.MATERIAL_STATE;

    /**
     * The table <code>brainshare_dev.material_view</code>.
     */
    public final TMaterialView MATERIAL_VIEW = ua.ddovgal.brainshareApi.jooq.tables.TMaterialView.MATERIAL_VIEW;

    /**
     * The table <code>brainshare_dev.modification</code>.
     */
    public final TModification MODIFICATION = ua.ddovgal.brainshareApi.jooq.tables.TModification.MODIFICATION;

    /**
     * The table <code>brainshare_dev.notification_about_material_achievement</code>.
     */
    public final TNotificationAboutMaterialAchievement NOTIFICATION_ABOUT_MATERIAL_ACHIEVEMENT = ua.ddovgal.brainshareApi.jooq.tables.TNotificationAboutMaterialAchievement.NOTIFICATION_ABOUT_MATERIAL_ACHIEVEMENT;

    /**
     * The table <code>brainshare_dev.notification_about_new_material</code>.
     */
    public final TNotificationAboutNewMaterial NOTIFICATION_ABOUT_NEW_MATERIAL = ua.ddovgal.brainshareApi.jooq.tables.TNotificationAboutNewMaterial.NOTIFICATION_ABOUT_NEW_MATERIAL;

    /**
     * The table <code>brainshare_dev.notification_about_new_modification</code>.
     */
    public final TNotificationAboutNewModification NOTIFICATION_ABOUT_NEW_MODIFICATION = ua.ddovgal.brainshareApi.jooq.tables.TNotificationAboutNewModification.NOTIFICATION_ABOUT_NEW_MODIFICATION;

    /**
     * The table <code>brainshare_dev.notification_about_subcomment</code>.
     */
    public final TNotificationAboutSubcomment NOTIFICATION_ABOUT_SUBCOMMENT = ua.ddovgal.brainshareApi.jooq.tables.TNotificationAboutSubcomment.NOTIFICATION_ABOUT_SUBCOMMENT;

    /**
     * The table <code>brainshare_dev.notification_type</code>.
     */
    public final TNotificationType NOTIFICATION_TYPE = ua.ddovgal.brainshareApi.jooq.tables.TNotificationType.NOTIFICATION_TYPE;

    /**
     * The table <code>brainshare_dev.notification_without_reason_reference</code>.
     */
    public final TNotificationWithoutReasonReference NOTIFICATION_WITHOUT_REASON_REFERENCE = ua.ddovgal.brainshareApi.jooq.tables.TNotificationWithoutReasonReference.NOTIFICATION_WITHOUT_REASON_REFERENCE;

    /**
     * The table <code>brainshare_dev.object_storage_file</code>.
     */
    public final TObjectStorageFile OBJECT_STORAGE_FILE = ua.ddovgal.brainshareApi.jooq.tables.TObjectStorageFile.OBJECT_STORAGE_FILE;

    /**
     * The table <code>brainshare_dev.section</code>.
     */
    public final TSection SECTION = ua.ddovgal.brainshareApi.jooq.tables.TSection.SECTION;

    /**
     * The table <code>brainshare_dev.subscription</code>.
     */
    public final TSubscription SUBSCRIPTION = ua.ddovgal.brainshareApi.jooq.tables.TSubscription.SUBSCRIPTION;

    /**
     * The table <code>brainshare_dev.user</code>.
     */
    public final TUser USER = ua.ddovgal.brainshareApi.jooq.tables.TUser.USER;

    /**
     * The table <code>brainshare_dev.user_bookmark</code>.
     */
    public final TUserBookmark USER_BOOKMARK = ua.ddovgal.brainshareApi.jooq.tables.TUserBookmark.USER_BOOKMARK;

    /**
     * The table <code>brainshare_dev.user_deferred_material</code>.
     */
    public final TUserDeferredMaterial USER_DEFERRED_MATERIAL = ua.ddovgal.brainshareApi.jooq.tables.TUserDeferredMaterial.USER_DEFERRED_MATERIAL;

    /**
     * The table <code>brainshare_dev.user_desirable_section</code>.
     */
    public final TUserDesirableSection USER_DESIRABLE_SECTION = ua.ddovgal.brainshareApi.jooq.tables.TUserDesirableSection.USER_DESIRABLE_SECTION;

    /**
     * The table <code>brainshare_dev.user_favourite_material</code>.
     */
    public final TUserFavouriteMaterial USER_FAVOURITE_MATERIAL = ua.ddovgal.brainshareApi.jooq.tables.TUserFavouriteMaterial.USER_FAVOURITE_MATERIAL;

    /**
     * The table <code>brainshare_dev.user_saved_attachment</code>.
     */
    public final TUserSavedAttachment USER_SAVED_ATTACHMENT = ua.ddovgal.brainshareApi.jooq.tables.TUserSavedAttachment.USER_SAVED_ATTACHMENT;

    /**
     * The table <code>brainshare_dev.user_status</code>.
     */
    public final TUserStatus USER_STATUS = ua.ddovgal.brainshareApi.jooq.tables.TUserStatus.USER_STATUS;

    /**
     * The table <code>brainshare_dev.user_status_in_section</code>.
     */
    public final TUserStatusInSection USER_STATUS_IN_SECTION = ua.ddovgal.brainshareApi.jooq.tables.TUserStatusInSection.USER_STATUS_IN_SECTION;

    /**
     * No further instances allowed
     */
    private BrainshareDev() {
        super("brainshare_dev", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
                TCommentary.COMMENTARY,
                TCommentaryMark.COMMENTARY_MARK,
                TContentData.CONTENT_DATA,
                TCourse.COURSE,
                TGenericNotification.GENERIC_NOTIFICATION,
                TInCommentaryModeratorRequest.IN_COMMENTARY_MODERATOR_REQUEST,
                TMaterial.MATERIAL,
                TMaterialAttachment.MATERIAL_ATTACHMENT,
                TMaterialFormat.MATERIAL_FORMAT,
                TMaterialMark.MATERIAL_MARK,
                TMaterialRecommendation.MATERIAL_RECOMMENDATION,
                TMaterialState.MATERIAL_STATE,
                TMaterialView.MATERIAL_VIEW,
                TModification.MODIFICATION,
                TNotificationAboutMaterialAchievement.NOTIFICATION_ABOUT_MATERIAL_ACHIEVEMENT,
                TNotificationAboutNewMaterial.NOTIFICATION_ABOUT_NEW_MATERIAL,
                TNotificationAboutNewModification.NOTIFICATION_ABOUT_NEW_MODIFICATION,
                TNotificationAboutSubcomment.NOTIFICATION_ABOUT_SUBCOMMENT,
                TNotificationType.NOTIFICATION_TYPE,
                TNotificationWithoutReasonReference.NOTIFICATION_WITHOUT_REASON_REFERENCE,
                TObjectStorageFile.OBJECT_STORAGE_FILE,
                TSection.SECTION,
                TSubscription.SUBSCRIPTION,
                TUser.USER,
                TUserBookmark.USER_BOOKMARK,
                TUserDeferredMaterial.USER_DEFERRED_MATERIAL,
                TUserDesirableSection.USER_DESIRABLE_SECTION,
                TUserFavouriteMaterial.USER_FAVOURITE_MATERIAL,
                TUserSavedAttachment.USER_SAVED_ATTACHMENT,
                TUserStatus.USER_STATUS,
                TUserStatusInSection.USER_STATUS_IN_SECTION);
    }
}
