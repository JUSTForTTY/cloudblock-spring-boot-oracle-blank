package com.company.project.model;

import javax.persistence.*;

@Table(name = "CSYS_SEQUENCE")
public class CsysSequence {
    @Id
    @Column(name = "CSYS_SEQUENCE_TABLENAME")
    private String csysSequenceTablename;

    @Column(name = "CSYS_SEQUENCE_SEQNO")
    private Long csysSequenceSeqno;

    /**
     * @return CSYS_SEQUENCE_TABLENAME
     */
    public String getCsysSequenceTablename() {
        return csysSequenceTablename;
    }

    /**
     * @param csysSequenceTablename
     */
    public void setCsysSequenceTablename(String csysSequenceTablename) {
        this.csysSequenceTablename = csysSequenceTablename;
    }

    /**
     * @return CSYS_SEQUENCE_SEQNO
     */
    public Long getCsysSequenceSeqno() {
        return csysSequenceSeqno;
    }

    /**
     * @param csysSequenceSeqno
     */
    public void setCsysSequenceSeqno(Long csysSequenceSeqno) {
        this.csysSequenceSeqno = csysSequenceSeqno;
    }
}