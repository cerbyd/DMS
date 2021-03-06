package models;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
abstract class TypeModel extends BaseModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
