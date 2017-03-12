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
import ua.ddovgal.brainshareApi.jooq.tables.TNotificationWithoutReasonReference;

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
public class RNotificationWithoutReasonReferenceRecord extends UpdatableRecordImpl<RNotificationWithoutReasonReferenceRecord> implements Record2<ULong, Object> {

    private static final long serialVersionUID = -773833734;

    /**
     * Create a detached RNotificationWithoutReasonReferenceRecord
     */
    public RNotificationWithoutReasonReferenceRecord() {
        super(TNotificationWithoutReasonReference.NOTIFICATION_WITHOUT_REASON_REFERENCE);
    }

    /**
     * Create a detached, initialised RNotificationWithoutReasonReferenceRecord
     */
    public RNotificationWithoutReasonReferenceRecord(ULong notificationId, Object reasonDataJson) {
        super(TNotificationWithoutReasonReference.NOTIFICATION_WITHOUT_REASON_REFERENCE);

        set(0, notificationId);
        set(1, reasonDataJson);
    }

    /**
     * Getter for <code>brainshare_dev.notification_without_reason_reference.notification_id</code>.
     */
    public ULong getNotificationId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>brainshare_dev.notification_without_reason_reference.notification_id</code>.
     */
    public void setNotificationId(ULong value) {
        set(0, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>brainshare_dev.notification_without_reason_reference.reason_data_json</code>.
     */
    public Object getReasonDataJson() {
        return (Object) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>brainshare_dev.notification_without_reason_reference.reason_data_json</code>.
     */
    public void setReasonDataJson(Object value) {
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
    public Row2<ULong, Object> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<ULong, Object> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TNotificationWithoutReasonReference.NOTIFICATION_WITHOUT_REASON_REFERENCE.NOTIFICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field2() {
        return TNotificationWithoutReasonReference.NOTIFICATION_WITHOUT_REASON_REFERENCE.REASON_DATA_JSON;
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
    public Object value2() {
        return getReasonDataJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RNotificationWithoutReasonReferenceRecord value1(ULong value) {
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
    public RNotificationWithoutReasonReferenceRecord value2(Object value) {
        setReasonDataJson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RNotificationWithoutReasonReferenceRecord values(ULong value1, Object value2) {
        value1(value1);
        value2(value2);
        return this;
    }
}
