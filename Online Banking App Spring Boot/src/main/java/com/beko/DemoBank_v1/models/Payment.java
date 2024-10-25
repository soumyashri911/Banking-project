package com.beko.DemoBank_v1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDateTime;


@Entity
@Table(name= "payments")
public class Payment {

    @Id
    @Column(name ="payment_id")
    private int payment_id;
    @Column(name ="account_id")
    private int account_id;
    @Column(name ="beneficiary")
    private String beneficiary;
    @Column(name ="beneficiary_acc_no")
    private String beneficiary_acc_no;
    @Column(name ="amount")
    private double amount;
    @Column(name ="reference_no")
    private String reference_no;
    @Column(name ="status")
    private String status;
    @Column(name ="reason_code")
    private String reason_code;

    private LocalDateTime created_at;

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getBeneficiary_acc_no() {
        return beneficiary_acc_no;
    }

    public void setBeneficiary_acc_no(String beneficiary_acc_no) {
        this.beneficiary_acc_no = beneficiary_acc_no;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getReference_no() {
        return reference_no;
    }

    public void setReference_no(String reference_no) {
        this.reference_no = reference_no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason_code() {
        return reason_code;
    }

    public void setReason_code(String reason_code) {
        this.reason_code = reason_code;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }


}
