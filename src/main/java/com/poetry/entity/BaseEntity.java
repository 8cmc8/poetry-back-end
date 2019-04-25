package com.poetry.entity;

import java.util.Date;

/**
 * ClassName: BaseEntity <br/>
 * Description: <br/>
 * date: 2019-04-25 22:01<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class BaseEntity {
    private Date dateCreate;
    private Date dateUpdate;

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "dateCreate=" + dateCreate +
                ", dateUpdate=" + dateUpdate +
                '}';
    }
}
