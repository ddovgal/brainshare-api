/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import ua.ddovgal.brainshareApi.jooq.tables.TNotificationAboutNewModification;

import javax.annotation.Generated;


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
public class RNotificationAboutNewModificationRecord extends UpdatableRecordImpl<RNotificationAboutNewModificationRecord> implements Record2<ULong, ULong> {

    private static final long serialVersionUID = 2062922198;

    /**
     * Create a detached RNotificationAboutNewModificationRecord
     */
    public RNotificationAboutNewModificationRecord() {
        super(TNotificationAboutNewModification.NOTIFICATION_ABOUT_NEW_MODIFICATION);
    }

    /**
     * Create a detached, initialised RNotificationAboutNewModificationRecord
     */
    public RNotificationAboutNewModificationRecord(ULong notificationId, ULong reasonId) {
        super(TNotificationAboutNewModification.NOTIFICATION_ABOUT_NEW_MODIFICATION);

        set(0, notificationId);
        set(1, reasonId);
    }

    /**
     * Getter for <code>brainshare_dev.notification_about_new_modification.notification_id</code>.
     */
    public ULong getNotificationId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>brainshare_dev.notification_about_new_modification.notification_id</code>.
     */
    public void setNotificationId(ULong value) {
        set(0, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>brainshare_dev.notification_about_new_modification.reason_id</code>.
     */
    public ULong getReasonId() {
        return (ULong) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>brainshare_dev.notification_about_new_modification.reason_id</code>.
     */
    public void setReasonId(ULong value) {
        set(1, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<ULong, ULong> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<ULong, ULong> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TNotificationAboutNewModification.NOTIFICATION_ABOUT_NEW_MODIFICATION.NOTIFICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return TNotificationAboutNewModification.NOTIFICATION_ABOUT_NEW_MODIFICATION.REASON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getNotificationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getReasonId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RNotificationAboutNewModificationRecord value1(ULong value) {
        setNotificationId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public RNotificationAboutNewModificationRecord value2(ULong value) {
        setReasonId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RNotificationAboutNewModificationRecord values(ULong value1, ULong value2) {
        value1(value1);
        value2(value2);
        return this;
    }
}
