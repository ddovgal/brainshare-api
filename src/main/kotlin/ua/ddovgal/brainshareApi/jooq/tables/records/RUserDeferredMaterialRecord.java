/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import ua.ddovgal.brainshareApi.jooq.tables.TUserDeferredMaterial;

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
public class RUserDeferredMaterialRecord extends UpdatableRecordImpl<RUserDeferredMaterialRecord> implements Record3<ULong, ULong, ULong> {

    private static final long serialVersionUID = 1926430422;

    /**
     * Create a detached RUserDeferredMaterialRecord
     */
    public RUserDeferredMaterialRecord() {
        super(TUserDeferredMaterial.USER_DEFERRED_MATERIAL);
    }

    /**
     * Create a detached, initialised RUserDeferredMaterialRecord
     */
    public RUserDeferredMaterialRecord(ULong userId, ULong materialId, ULong possibleCourseId) {
        super(TUserDeferredMaterial.USER_DEFERRED_MATERIAL);

        set(0, userId);
        set(1, materialId);
        set(2, possibleCourseId);
    }

    /**
     * Getter for <code>brainshare_dev.user_deferred_material.user_id</code>.
     */
    public ULong getUserId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>brainshare_dev.user_deferred_material.user_id</code>.
     */
    public void setUserId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>brainshare_dev.user_deferred_material.material_id</code>.
     */
    public ULong getMaterialId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>brainshare_dev.user_deferred_material.material_id</code>.
     */
    public void setMaterialId(ULong value) {
        set(1, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>brainshare_dev.user_deferred_material.possible_course_id</code>.
     */
    public ULong getPossibleCourseId() {
        return (ULong) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>brainshare_dev.user_deferred_material.possible_course_id</code>.
     */
    public void setPossibleCourseId(ULong value) {
        set(2, value);
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
    public Row3<ULong, ULong, ULong> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<ULong, ULong, ULong> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TUserDeferredMaterial.USER_DEFERRED_MATERIAL.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return TUserDeferredMaterial.USER_DEFERRED_MATERIAL.MATERIAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return TUserDeferredMaterial.USER_DEFERRED_MATERIAL.POSSIBLE_COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getUserId();
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
    public ULong value3() {
        return getPossibleCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RUserDeferredMaterialRecord value1(ULong value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RUserDeferredMaterialRecord value2(ULong value) {
        setMaterialId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public RUserDeferredMaterialRecord value3(ULong value) {
        setPossibleCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RUserDeferredMaterialRecord values(ULong value1, ULong value2, ULong value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }
}
