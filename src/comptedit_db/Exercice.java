package comptedit_db;
// Generated 4 juin 2014 20:15:37 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Exercice generated by hbm2java
 */
public class Exercice  implements java.io.Serializable {


     private Long idExercice;
     private Integer entreprise;
     private Integer fec;
     private Date dateBegin;
     private Date dateEnd;

    public Exercice() {
    }

    public Exercice(Integer entreprise, Integer fec, Date dateBegin, Date dateEnd) {
       this.entreprise = entreprise;
       this.fec = fec;
       this.dateBegin = dateBegin;
       this.dateEnd = dateEnd;
    }
   
    public Long getIdExercice() {
        return this.idExercice;
    }
    
    public void setIdExercice(Long idExercice) {
        this.idExercice = idExercice;
    }
    public Integer getEntreprise() {
        return this.entreprise;
    }
    
    public void setEntreprise(Integer entreprise) {
        this.entreprise = entreprise;
    }
    public Integer getFec() {
        return this.fec;
    }
    
    public void setFec(Integer fec) {
        this.fec = fec;
    }
    public Date getDateBegin() {
        return this.dateBegin;
    }
    
    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }
    public Date getDateEnd() {
        return this.dateEnd;
    }
    
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }




}


