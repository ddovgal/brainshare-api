/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq.tables.pojos;


import org.jooq.types.UInteger;
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
public class UserDesirableSection implements Serializable {

    private static final long serialVersionUID = 290363641;

    private ULong userId;
    private UInteger sectionId;

    public UserDesirableSection() {
    }

    public UserDesirableSection(UserDesirableSection value) {
        this.userId = value.userId;
        this.sectionId = value.sectionId;
    }

    public UserDesirableSection(
            ULong userId,
            UInteger sectionId
    ) {
        this.userId = userId;
        this.sectionId = sectionId;
    }

    public ULong getUserId() {
        return this.userId;
    }

    public void setUserId(ULong userId) {
        this.userId = userId;
    }

    public UInteger getSectionId() {
        return this.sectionId;
    }

    public void setSectionId(UInteger sectionId) {
        this.sectionId = sectionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserDesirableSection (");

        sb.append(userId);
        sb.append(", ").append(sectionId);

        sb.append(")");
        return sb.toString();
    }
}
