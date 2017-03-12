/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq.tables.pojos;


import org.jooq.types.ULong;

import javax.annotation.Generated;
import java.io.Serializable;


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
public class NotificationWithoutReasonReference implements Serializable {

    private static final long serialVersionUID = 1914834880;

    private ULong notificationId;
    private Object reasonDataJson;

    public NotificationWithoutReasonReference() {
    }

    public NotificationWithoutReasonReference(NotificationWithoutReasonReference value) {
        this.notificationId = value.notificationId;
        this.reasonDataJson = value.reasonDataJson;
    }

    public NotificationWithoutReasonReference(
            ULong notificationId,
            Object reasonDataJson
    ) {
        this.notificationId = notificationId;
        this.reasonDataJson = reasonDataJson;
    }

    public ULong getNotificationId() {
        return this.notificationId;
    }

    public void setNotificationId(ULong notificationId) {
        this.notificationId = notificationId;
    }

    public Object getReasonDataJson() {
        return this.reasonDataJson;
    }

    public void setReasonDataJson(Object reasonDataJson) {
        this.reasonDataJson = reasonDataJson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("NotificationWithoutReasonReference (");

        sb.append(notificationId);
        sb.append(", ").append(reasonDataJson);

        sb.append(")");
        return sb.toString();
    }
}
