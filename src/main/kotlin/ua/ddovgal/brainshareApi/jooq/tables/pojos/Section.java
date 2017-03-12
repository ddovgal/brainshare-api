/*
 * This file is generated by jOOQ.
*/
package ua.ddovgal.brainshareApi.jooq.tables.pojos;


import org.jooq.types.UInteger;

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
public class Section implements Serializable {

    private static final long serialVersionUID = 1036086334;

    private UInteger id;
    private UInteger superSectionId;
    private String sectionName;
    private String description;

    public Section() {
    }

    public Section(Section value) {
        this.id = value.id;
        this.superSectionId = value.superSectionId;
        this.sectionName = value.sectionName;
        this.description = value.description;
    }

    public Section(
            UInteger id,
            UInteger superSectionId,
            String sectionName,
            String description
    ) {
        this.id = id;
        this.superSectionId = superSectionId;
        this.sectionName = sectionName;
        this.description = description;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public UInteger getSuperSectionId() {
        return this.superSectionId;
    }

    public void setSuperSectionId(UInteger superSectionId) {
        this.superSectionId = superSectionId;
    }

    public String getSectionName() {
        return this.sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Section (");

        sb.append(id);
        sb.append(", ").append(superSectionId);
        sb.append(", ").append(sectionName);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
