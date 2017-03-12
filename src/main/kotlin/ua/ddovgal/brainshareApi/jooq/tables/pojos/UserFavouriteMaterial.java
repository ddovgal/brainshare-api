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
public class UserFavouriteMaterial implements Serializable {

    private static final long serialVersionUID = 1485006347;

    private ULong userId;
    private ULong materialId;
    private ULong possibleCourseId;

    public UserFavouriteMaterial() {
    }

    public UserFavouriteMaterial(UserFavouriteMaterial value) {
        this.userId = value.userId;
        this.materialId = value.materialId;
        this.possibleCourseId = value.possibleCourseId;
    }

    public UserFavouriteMaterial(
            ULong userId,
            ULong materialId,
            ULong possibleCourseId
    ) {
        this.userId = userId;
        this.materialId = materialId;
        this.possibleCourseId = possibleCourseId;
    }

    public ULong getUserId() {
        return this.userId;
    }

    public void setUserId(ULong userId) {
        this.userId = userId;
    }

    public ULong getMaterialId() {
        return this.materialId;
    }

    public void setMaterialId(ULong materialId) {
        this.materialId = materialId;
    }

    public ULong getPossibleCourseId() {
        return this.possibleCourseId;
    }

    public void setPossibleCourseId(ULong possibleCourseId) {
        this.possibleCourseId = possibleCourseId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserFavouriteMaterial (");

        sb.append(userId);
        sb.append(", ").append(materialId);
        sb.append(", ").append(possibleCourseId);

        sb.append(")");
        return sb.toString();
    }
}
