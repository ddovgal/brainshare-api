/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq.tables;


import org.jooq.*;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import ua.ddovgal.brainshareApi.jooq.BrainshareDev;
import ua.ddovgal.brainshareApi.jooq.Keys;
import ua.ddovgal.brainshareApi.jooq.tables.records.RGenericNotificationRecord;

import javax.annotation.Generated;
import java.sql.Timestamp;
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
public class TGenericNotification extends TableImpl<RGenericNotificationRecord> {

    /**
     * The reference instance of <code>brainshare_dev.generic_notification</code>
     */
    public static final TGenericNotification GENERIC_NOTIFICATION = new TGenericNotification();
    private static final long serialVersionUID = -638142088;
    /**
     * The column <code>brainshare_dev.generic_notification.id</code>.
     */
    public final TableField<RGenericNotificationRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");
    /**
     * The column <code>brainshare_dev.generic_notification.receiver_user_id</code>.
     */
    public final TableField<RGenericNotificationRecord, ULong> RECEIVER_USER_ID = createField("receiver_user_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");
    /**
     * The column <code>brainshare_dev.generic_notification.creation_datetime</code>.
     */
    public final TableField<RGenericNotificationRecord, Timestamp> CREATION_DATETIME = createField("creation_datetime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");
    /**
     * The column <code>brainshare_dev.generic_notification.type_id</code>.
     */
    public final TableField<RGenericNotificationRecord, UInteger> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");
    /**
     * The column <code>brainshare_dev.generic_notification.is_checked_by_receiver</code>.
     */
    public final TableField<RGenericNotificationRecord, Byte> IS_CHECKED_BY_RECEIVER = createField("is_checked_by_receiver", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * Create a <code>brainshare_dev.generic_notification</code> table reference
     */
    public TGenericNotification() {
        this("generic_notification", null);
    }

    /**
     * Create an aliased <code>brainshare_dev.generic_notification</code> table reference
     */
    public TGenericNotification(String alias) {
        this(alias, GENERIC_NOTIFICATION);
    }

    private TGenericNotification(String alias, Table<RGenericNotificationRecord> aliased) {
        this(alias, aliased, null);
    }

    private TGenericNotification(String alias, Table<RGenericNotificationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RGenericNotificationRecord> getRecordType() {
        return RGenericNotificationRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return BrainshareDev.BRAINSHARE_DEV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RGenericNotificationRecord, ULong> getIdentity() {
        return Keys.IDENTITY_GENERIC_NOTIFICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RGenericNotificationRecord> getPrimaryKey() {
        return Keys.KEY_GENERIC_NOTIFICATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RGenericNotificationRecord>> getKeys() {
        return Arrays.<UniqueKey<RGenericNotificationRecord>>asList(Keys.KEY_GENERIC_NOTIFICATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RGenericNotificationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RGenericNotificationRecord, ?>>asList(Keys.FK_GENERIC_NOTIFICATION_RECEIVER_USER_ID, Keys.FK_GENERIC_NOTIFICATION_TYPE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGenericNotification as(String alias) {
        return new TGenericNotification(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TGenericNotification rename(String name) {
        return new TGenericNotification(name, null);
    }
}
