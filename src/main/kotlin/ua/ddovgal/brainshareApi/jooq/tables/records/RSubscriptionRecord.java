/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;
import ua.ddovgal.brainshareApi.jooq.tables.TSubscription;

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
public class RSubscriptionRecord extends TableRecordImpl<RSubscriptionRecord> implements Record2<ULong, ULong> {

    private static final long serialVersionUID = 42020882;

    /**
     * Create a detached RSubscriptionRecord
     */
    public RSubscriptionRecord() {
        super(TSubscription.SUBSCRIPTION);
    }

    /**
     * Create a detached, initialised RSubscriptionRecord
     */
    public RSubscriptionRecord(ULong subscriberId, ULong authorityId) {
        super(TSubscription.SUBSCRIPTION);

        set(0, subscriberId);
        set(1, authorityId);
    }

    /**
     * Getter for <code>brainshare_dev.subscription.subscriber_id</code>.
     */
    public ULong getSubscriberId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>brainshare_dev.subscription.subscriber_id</code>.
     */
    public void setSubscriberId(ULong value) {
        set(0, value);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>brainshare_dev.subscription.authority_id</code>.
     */
    public ULong getAuthorityId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>brainshare_dev.subscription.authority_id</code>.
     */
    public void setAuthorityId(ULong value) {
        set(1, value);
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
        return TSubscription.SUBSCRIPTION.SUBSCRIBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return TSubscription.SUBSCRIPTION.AUTHORITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getSubscriberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getAuthorityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RSubscriptionRecord value1(ULong value) {
        setSubscriberId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public RSubscriptionRecord value2(ULong value) {
        setAuthorityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RSubscriptionRecord values(ULong value1, ULong value2) {
        value1(value1);
        value2(value2);
        return this;
    }
}
