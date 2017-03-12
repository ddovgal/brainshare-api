/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import ua.ddovgal.brainshareApi.jooq.tables.TMaterialView;

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
public class RMaterialViewRecord extends UpdatableRecordImpl<RMaterialViewRecord> implements Record2<ULong, ULong> {

    private static final long serialVersionUID = 1533637198;

    /**
     * Create a detached RMaterialViewRecord
     */
    public RMaterialViewRecord() {
        super(TMaterialView.MATERIAL_VIEW);
    }

    /**
     * Create a detached, initialised RMaterialViewRecord
     */
    public RMaterialViewRecord(ULong viewerUserId, ULong materialId) {
        super(TMaterialView.MATERIAL_VIEW);

        set(0, viewerUserId);
        set(1, materialId);
    }

    /**
     * Getter for <code>brainshare_dev.material_view.viewer_user_id</code>.
     */
    public ULong getViewerUserId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>brainshare_dev.material_view.viewer_user_id</code>.
     */
    public void setViewerUserId(ULong value) {
        set(0, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>brainshare_dev.material_view.material_id</code>.
     */
    public ULong getMaterialId() {
        return (ULong) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>brainshare_dev.material_view.material_id</code>.
     */
    public void setMaterialId(ULong value) {
        set(1, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<ULong, ULong> key() {
        return (Record2) super.key();
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
        return TMaterialView.MATERIAL_VIEW.VIEWER_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return TMaterialView.MATERIAL_VIEW.MATERIAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getViewerUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getMaterialId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RMaterialViewRecord value1(ULong value) {
        setViewerUserId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public RMaterialViewRecord value2(ULong value) {
        setMaterialId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RMaterialViewRecord values(ULong value1, ULong value2) {
        value1(value1);
        value2(value2);
        return this;
    }
}
