/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq.tables;


import org.jooq.*;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;
import ua.ddovgal.brainshareApi.jooq.BrainshareDev;
import ua.ddovgal.brainshareApi.jooq.Keys;
import ua.ddovgal.brainshareApi.jooq.tables.records.RUserDeferredMaterialRecord;

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
public class TUserDeferredMaterial extends TableImpl<RUserDeferredMaterialRecord> {

    /**
     * The reference instance of <code>brainshare_dev.user_deferred_material</code>
     */
    public static final TUserDeferredMaterial USER_DEFERRED_MATERIAL = new TUserDeferredMaterial();
    private static final long serialVersionUID = -899601794;
    /**
     * The column <code>brainshare_dev.user_deferred_material.user_id</code>.
     */
    public final TableField<RUserDeferredMaterialRecord, ULong> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");
    /**
     * The column <code>brainshare_dev.user_deferred_material.material_id</code>.
     */
    public final TableField<RUserDeferredMaterialRecord, ULong> MATERIAL_ID = createField("material_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");
    /**
     * The column <code>brainshare_dev.user_deferred_material.possible_course_id</code>.
     */
    public final TableField<RUserDeferredMaterialRecord, ULong> POSSIBLE_COURSE_ID = createField("possible_course_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * Create a <code>brainshare_dev.user_deferred_material</code> table reference
     */
    public TUserDeferredMaterial() {
        this("user_deferred_material", null);
    }

    /**
     * Create an aliased <code>brainshare_dev.user_deferred_material</code> table reference
     */
    public TUserDeferredMaterial(String alias) {
        this(alias, USER_DEFERRED_MATERIAL);
    }

    private TUserDeferredMaterial(String alias, Table<RUserDeferredMaterialRecord> aliased) {
        this(alias, aliased, null);
    }

    private TUserDeferredMaterial(String alias, Table<RUserDeferredMaterialRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RUserDeferredMaterialRecord> getRecordType() {
        return RUserDeferredMaterialRecord.class;
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
    public UniqueKey<RUserDeferredMaterialRecord> getPrimaryKey() {
        return Keys.KEY_USER_DEFERRED_MATERIAL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RUserDeferredMaterialRecord>> getKeys() {
        return Arrays.<UniqueKey<RUserDeferredMaterialRecord>>asList(Keys.KEY_USER_DEFERRED_MATERIAL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RUserDeferredMaterialRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RUserDeferredMaterialRecord, ?>>asList(Keys.FK_USER_DEFERRED_MATERIAL_USER_ID, Keys.FK_USER_DEFERRED_MATERIAL_MATERIAL_ID, Keys.FK_USER_DEFERRED_MATERIAL_POSSIBLE_COURSE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserDeferredMaterial as(String alias) {
        return new TUserDeferredMaterial(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TUserDeferredMaterial rename(String name) {
        return new TUserDeferredMaterial(name, null);
    }
}
