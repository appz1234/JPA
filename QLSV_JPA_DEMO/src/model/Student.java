/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MANHKHUC
 */

@Entity
@Table(name = "STUDENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findById", query = "SELECT s FROM Student s WHERE s.id = :id"),
    @NamedQuery(name = "Student.findByName", query = "SELECT s FROM Student s WHERE s.name = :name"),
    @NamedQuery(name = "Student.findByClass1", query = "SELECT s FROM Student s WHERE s.class1 = :class1"),
    @NamedQuery(name = "Student.findByGender", query = "SELECT s FROM Student s WHERE s.gender = :gender"),
    @NamedQuery(name = "Student.findByDob", query = "SELECT s FROM Student s WHERE s.dob = :dob")})
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    @SequenceGenerator(name = "SEQ1", allocationSize = 1, sequenceName = "SEQ1")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ1")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 20)
    private String name;
    @Basic(optional = false)
    @Column(name = "CLASS", nullable = false, length = 20)
    private String class1;
    @Basic(optional = false)
    @Column(name = "GENDER", nullable = false)
    private BigInteger gender;
    @Basic(optional = false)
    @Column(name = "DOB", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dob;

    public Student() {
    }

    public Student(String name, String class1, BigInteger gender, Date dob) {
        this.name = name;
        this.class1 = class1;
        this.gender = gender;
        this.dob = dob;
    }

    public Student(BigDecimal id) {
        this.id = id;
    }

    public Student(BigDecimal id, String name, String class1, BigInteger gender, Date dob) {
        this.id = id;
        this.name = name;
        this.class1 = class1;
        this.gender = gender;
        this.dob = dob;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public BigInteger getGender() {
        return gender;
    }

    public void setGender(BigInteger gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Student[ id=" + id + " ]";
    }
    
}
