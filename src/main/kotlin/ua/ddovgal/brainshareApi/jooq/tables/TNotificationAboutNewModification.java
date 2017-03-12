/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq.tables;


import org.jooq.*;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;
import ua.ddovgal.brainshareApi.jooq.BrainshareDev;
import ua.ddovgal.brainshareApi.jooq.Keys;
import ua.ddovgal.brainshareApi.jooq.tables.records.RNotificationAboutNewModificationRecord;

import javax.annotation.Generated;
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
public class TNotificationAboutNewModification extends TableImpl<RNotificationAboutNewModificationRecord> {

    /**
     * The reference instance of <code>brainshare_dev.notification_about_new_modification</code>
     */
    public static final TNotificationAboutNewModification NOTIFICATION_ABOUT_NEW_MODIFICATION = new TNotificationAboutNewModification();
    private static final long serialVersionUID = 1836052982;
    /**
     * The column <code>brainshare_dev.notification_about_new_modification.notification_id</code>.
     */
    public final TableField<RNotificationAboutNewModificationRecord, ULong> NOTIFICATION_ID = createField("notification_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");
    /**
     * The column <code>brainshare_dev.notification_about_new_modification.reason_id</code>.
     */
    public final TableField<RNotificationAboutNewModificationRecord, ULong> REASON_ID = createField("reason_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>brainshare_dev.notification_about_new_modification</code> table reference
     */
    public TNotificationAboutNewModification() {
        this("notification_about_new_modification", null);
    }

    /**
     * Create an aliased <code>brainshare_dev.notification_about_new_modification</code> table reference
     */
    public TNotificationAboutNewModification(String alias) {
        this(alias, NOTIFICATION_ABOUT_NEW_MODIFICATION);
    }

    private TNotificationAboutNewModification(String alias, Table<RNotificationAboutNewModificationRecord> aliased) {
        this(alias, aliased, null);
    }

    private TNotificationAboutNewModification(String alias, Table<RNotificationAboutNewModificationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RNotificationAboutNewModificationRecord> getRecordType() {
        return RNotificationAboutNewModificationRecord.class;
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
    public UniqueKey<RNotificationAboutNewModificationRecord> getPrimaryKey() {
        return Keys.KEY_NOTIFICATION_ABOUT_NEW_MODIFICATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RNotificationAboutNewModificationRecord>> getKeys() {
        return Arrays.<UniqueKey<RNotificationAboutNewModificationRecord>>asList(Keys.KEY_NOTIFICATION_ABOUT_NEW_MODIFICATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RNotificationAboutNewModificationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RNotificationAboutNewModificationRecord, ?>>asList(Keys.FK_NOTIFICATION_ABOUT_NEW_MODIFICATION_NOTIFICATION_ID, Keys.FK_NOTIFICATION_ABOUT_NEW_MODIFICATION_REASON_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotificationAboutNewModification as(String alias) {
        return new TNotificationAboutNewModification(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TNotificationAboutNewModification rename(String name) {
        return new TNotificationAboutNewModification(name, null);
    }
}
