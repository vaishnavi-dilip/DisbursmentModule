package com.cjc.disbursment.service;

import java.util.List;
import java.util.Optional;

import com.cjc.disbursment.model.Bank;
import com.cjc.disbursment.model.CaseNumber;
//import com.cjc.disbursment.model.Casenumber;
import com.cjc.disbursment.model.Cibil;

import com.cjc.disbursment.model.Customer;
import com.cjc.disbursment.model.Dealer;
import com.cjc.disbursment.model.DisbursmentCreation;
import com.cjc.disbursment.model.DisbursmentLeadgerDetails;
import com.cjc.disbursment.model.EMIDetails;
import com.cjc.disbursment.model.GurrenterDetails;
import com.cjc.disbursment.model.LedgerDetail;
import com.cjc.disbursment.model.LedgerMonthlydetails;
import com.cjc.disbursment.model.LoanCase;
import com.cjc.disbursment.model.LoanDetails;
import com.cjc.disbursment.model.SanctionLetter;
import com.cjc.disbursment.model.SubDealer;
import com.cjc.disbursment.model.Tenure;
import com.cjc.disbursment.model.VehicleDetails;
import com.cjc.disbursment.model.Disbursment;
import com.cjc.disbursment.model.DisbursmentLeadger;

public interface ServiceI
{
	public Bank addBank(Bank b);
	public Cibil addcbil(Cibil c);
	public Customer addCust(Customer cust);
	public Dealer addDeal(Dealer d);
	public DisbursmentCreation addDcr(DisbursmentCreation dc);
	public DisbursmentLeadgerDetails adddl(DisbursmentLeadgerDetails dl);
	public  EMIDetails addEmi(EMIDetails ed);
	public GurrenterDetails addGui(GurrenterDetails gd);
	public LedgerDetail addLed(LedgerDetail ld);
	public LedgerMonthlydetails addLedMonthly(LedgerMonthlydetails ldm);
	public LoanCase adaLoan(LoanCase lc);
	public LoanDetails addLoanDetail(LoanDetails ld);
	public SanctionLetter addSanction(SanctionLetter sc);
	public SubDealer addsubd(SubDealer sb);
	public Tenure addTenu(Tenure tn);
	public VehicleDetails addvehicle(VehicleDetails vd);
	public CaseNumber addCasen(CaseNumber cn);
	Disbursment addDisbursment(Disbursment disbursment);

	DisbursmentLeadger addDisbursmentLeadgerDetail(DisbursmentLeadger disbursmentLeadgerDetail);

	LedgerDetail addLeadgerDetail(LedgerDetail leadgerDetail);

	LedgerMonthlydetails addLeadgerMonthlyUpdateData(LedgerMonthlydetails ledgerMonthlydetails);

	DisbursmentLeadger getDisbursmentLeadgerDetail(int id);

	void deleteDisbursmentLeadger(int id);

	void updateDisbursmentLeadger(DisbursmentLeadger disbursmentLeadgerDetail);

	Disbursment getDisbursment(int id);

	void updateDisbursment(Disbursment disbursment);

	void deleteDisbursment(int id);

	LedgerDetail getLeadgerDetails(int id);

	void updateLeadgerDetails(LedgerDetail ledgerDetail);

	void deleteLeadgerDetails(int id);

	LedgerMonthlydetails getLeadgerMonthlyupdate(int id);

	void updateLeadgerMonthlyupdate(LedgerMonthlydetails ledgerMonthlydetails);

	void deleteLeadgerMonthlyupdate(int id);

	List<DisbursmentLeadger> getAllData();

	List<Disbursment> getAllDisbursmentData();

	List<LedgerDetail> getAllLeadgerDetailData();
	
	public Optional<Bank> getBankById(int bid);
	
	Customer getCustomerByPDFId(int id);

	
}
