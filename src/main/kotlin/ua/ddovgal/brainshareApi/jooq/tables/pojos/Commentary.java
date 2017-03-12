/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq.tables.pojos;


import org.jooq.types.UInteger;
import org.jooq.types.ULong;

import javax.annotation.Generated;
import java.io.Serializable;
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
public class Commentary implements Serializable {

    private static final long serialVersionUID = 1487104876;

    private ULong id;
    private ULong authorUserId;
    private ULong materialId;
    private ULong parentCommentaryId;
    private Integer ratio;
    private UInteger positiveMarkCount;
    private UInteger negativeMarkCount;
    private Timestamp creationDatetime;
    private ULong contentDataId;

    public Commentary() {
    }

    public Commentary(Commentary value) {
        this.id = value.id;
        this.authorUserId = value.authorUserId;
        this.materialId = value.materialId;
        this.parentCommentaryId = value.parentCommentaryId;
        this.ratio = value.ratio;
        this.positiveMarkCount = value.positiveMarkCount;
        this.negativeMarkCount = value.negativeMarkCount;
        this.creationDatetime = value.creationDatetime;
        this.contentDataId = value.contentDataId;
    }

    public Commentary(
            ULong id,
            ULong authorUserId,
            ULong materialId,
            ULong parentCommentaryId,
            Integer ratio,
            UInteger positiveMarkCount,
            UInteger negativeMarkCount,
            Timestamp creationDatetime,
            ULong contentDataId
    ) {
        this.id = id;
        this.authorUserId = authorUserId;
        this.materialId = materialId;
        this.parentCommentaryId = parentCommentaryId;
        this.ratio = ratio;
        this.positiveMarkCount = positiveMarkCount;
        this.negativeMarkCount = negativeMarkCount;
        this.creationDatetime = creationDatetime;
        this.contentDataId = contentDataId;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public ULong getAuthorUserId() {
        return this.authorUserId;
    }

    public void setAuthorUserId(ULong authorUserId) {
        this.authorUserId = authorUserId;
    }

    public ULong getMaterialId() {
        return this.materialId;
    }

    public void setMaterialId(ULong materialId) {
        this.materialId = materialId;
    }

    public ULong getParentCommentaryId() {
        return this.parentCommentaryId;
    }

    public void setParentCommentaryId(ULong parentCommentaryId) {
        this.parentCommentaryId = parentCommentaryId;
    }

    public Integer getRatio() {
        return this.ratio;
    }

    public void setRatio(Integer ratio) {
        this.ratio = ratio;
    }

    public UInteger getPositiveMarkCount() {
        return this.positiveMarkCount;
    }

    public void setPositiveMarkCount(UInteger positiveMarkCount) {
        this.positiveMarkCount = positiveMarkCount;
    }

    public UInteger getNegativeMarkCount() {
        return this.negativeMarkCount;
    }

    public void setNegativeMarkCount(UInteger negativeMarkCount) {
        this.negativeMarkCount = negativeMarkCount;
    }

    public Timestamp getCreationDatetime() {
        return this.creationDatetime;
    }

    public void setCreationDatetime(Timestamp creationDatetime) {
        this.creationDatetime = creationDatetime;
    }

    public ULong getContentDataId() {
        return this.contentDataId;
    }

    public void setContentDataId(ULong contentDataId) {
        this.contentDataId = contentDataId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Commentary (");

        sb.append(id);
        sb.append(", ").append(authorUserId);
        sb.append(", ").append(materialId);
        sb.append(", ").append(parentCommentaryId);
        sb.append(", ").append(ratio);
        sb.append(", ").append(positiveMarkCount);
        sb.append(", ").append(negativeMarkCount);
        sb.append(", ").append(creationDatetime);
        sb.append(", ").append(contentDataId);

        sb.append(")");
        return sb.toString();
    }
}
