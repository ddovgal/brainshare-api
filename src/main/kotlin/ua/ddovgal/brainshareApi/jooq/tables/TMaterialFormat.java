/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq.tables;


import org.jooq.*;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import ua.ddovgal.brainshareApi.jooq.BrainshareDev;
import ua.ddovgal.brainshareApi.jooq.Keys;
import ua.ddovgal.brainshareApi.jooq.tables.records.RMaterialFormatRecord;

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
public class TMaterialFormat extends TableImpl<RMaterialFormatRecord> {

    /**
     * The reference instance of <code>brainshare_dev.material_format</code>
     */
    public static final TMaterialFormat MATERIAL_FORMAT = new TMaterialFormat();
    private static final long serialVersionUID = 1751824960;
    /**
     * The column <code>brainshare_dev.material_format.id</code>.
     */
    public final TableField<RMaterialFormatRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");
    /**
     * The column <code>brainshare_dev.material_format.format_name</code>.
     */
    public final TableField<RMaterialFormatRecord, String> FORMAT_NAME = createField("format_name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");
    /**
     * The column <code>brainshare_dev.material_format.description</code>.
     */
    public final TableField<RMaterialFormatRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>brainshare_dev.material_format</code> table reference
     */
    public TMaterialFormat() {
        this("material_format", null);
    }

    /**
     * Create an aliased <code>brainshare_dev.material_format</code> table reference
     */
    public TMaterialFormat(String alias) {
        this(alias, MATERIAL_FORMAT);
    }

    private TMaterialFormat(String alias, Table<RMaterialFormatRecord> aliased) {
        this(alias, aliased, null);
    }

    private TMaterialFormat(String alias, Table<RMaterialFormatRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RMaterialFormatRecord> getRecordType() {
        return RMaterialFormatRecord.class;
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
    public UniqueKey<RMaterialFormatRecord> getPrimaryKey() {
        return Keys.KEY_MATERIAL_FORMAT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RMaterialFormatRecord>> getKeys() {
        return Arrays.<UniqueKey<RMaterialFormatRecord>>asList(Keys.KEY_MATERIAL_FORMAT_PRIMARY, Keys.KEY_MATERIAL_FORMAT_FORMAT_NAME_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMaterialFormat as(String alias) {
        return new TMaterialFormat(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TMaterialFormat rename(String name) {
        return new TMaterialFormat(name, null);
    }
}
