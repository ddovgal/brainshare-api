/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import ua.ddovgal.brainshareApi.jooq.tables.TModification;

import javax.annotation.Generated;
import java.sql.Timestamp;


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
public class RModificationRecord extends UpdatableRecordImpl<RModificationRecord> implements Record6<ULong, ULong, ULong, Object, Byte, Timestamp> {

    private static final long serialVersionUID = -1323716184;

    /**
     * Create a detached RModificationRecord
     */
    public RModificationRecord() {
        super(TModification.MODIFICATION);
    }

    /**
     * Create a detached, initialised RModificationRecord
     */
    public RModificationRecord(ULong id, ULong sourceMaterialId, ULong requesterUserId, Object modificationDataJson, Byte isAccepted, Timestamp creationDatetime) {
        super(TModification.MODIFICATION);

        set(0, id);
        set(1, sourceMaterialId);
        set(2, requesterUserId);
        set(3, modificationDataJson);
        set(4, isAccepted);
        set(5, creationDatetime);
    }

    /**
     * Getter for <code>brainshare_dev.modification.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>brainshare_dev.modification.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>brainshare_dev.modification.source_material_id</code>.
     */
    public ULong getSourceMaterialId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>brainshare_dev.modification.source_material_id</code>.
     */
    public void setSourceMaterialId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>brainshare_dev.modification.requester_user_id</code>.
     */
    public ULong getRequesterUserId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>brainshare_dev.modification.requester_user_id</code>.
     */
    public void setRequesterUserId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>brainshare_dev.modification.modification_data_json</code>.
     */
    public Object getModificationDataJson() {
        return (Object) get(3);
    }

    /**
     * Setter for <code>brainshare_dev.modification.modification_data_json</code>.
     */
    public void setModificationDataJson(Object value) {
        set(3, value);
    }

    /**
     * Getter for <code>brainshare_dev.modification.is_accepted</code>.
     */
    public Byte getIsAccepted() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>brainshare_dev.modification.is_accepted</code>.
     */
    public void setIsAccepted(Byte value) {
        set(4, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>brainshare_dev.modification.creation_datetime</code>.
     */
    public Timestamp getCreationDatetime() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>brainshare_dev.modification.creation_datetime</code>.
     */
    public void setCreationDatetime(Timestamp value) {
        set(5, value);
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
    public Row6<ULong, ULong, ULong, Object, Byte, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, ULong, ULong, Object, Byte, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TModification.MODIFICATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return TModification.MODIFICATION.SOURCE_MATERIAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return TModification.MODIFICATION.REQUESTER_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field4() {
        return TModification.MODIFICATION.MODIFICATION_DATA_JSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TModification.MODIFICATION.IS_ACCEPTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TModification.MODIFICATION.CREATION_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getSourceMaterialId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getRequesterUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value4() {
        return getModificationDataJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsAccepted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreationDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RModificationRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RModificationRecord value2(ULong value) {
        setSourceMaterialId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RModificationRecord value3(ULong value) {
        setRequesterUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RModificationRecord value4(Object value) {
        setModificationDataJson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RModificationRecord value5(Byte value) {
        setIsAccepted(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public RModificationRecord value6(Timestamp value) {
        setCreationDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RModificationRecord values(ULong value1, ULong value2, ULong value3, Object value4, Byte value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }
}
