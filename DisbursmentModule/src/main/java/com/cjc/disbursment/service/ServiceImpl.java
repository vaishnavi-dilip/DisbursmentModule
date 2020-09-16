package com.cjc.disbursment.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.disbursment.controller.BankController;
import com.cjc.disbursment.model.Bank;
import com.cjc.disbursment.model.CaseNumber;
//import com.cjc.disbursment.model.Casenumber;
import com.cjc.disbursment.model.Cibil;

import com.cjc.disbursment.model.Customer;
import com.cjc.disbursment.model.Dealer;
import com.cjc.disbursment.model.Disbursment;
import com.cjc.disbursment.model.DisbursmentCreation;
import com.cjc.disbursment.model.DisbursmentLeadger;
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
import com.cjc.disbursment.repository.BankRepo;
import com.cjc.disbursment.repository.CaseNumberRepository;
import com.cjc.disbursment.repository.CibilRepo;
import com.cjc.disbursment.repository.CustomerRepo;
import com.cjc.disbursment.repository.DealerRepo;
import com.cjc.disbursment.repository.DisbCreationRepo;
import com.cjc.disbursment.repository.Disbleadgerrepo;
import com.cjc.disbursment.repository.DisbursmentLeadgerRepository;
import com.cjc.disbursment.repository.EmiRepo;
import com.cjc.disbursment.repository.GuarantorRepo;
import com.cjc.disbursment.repository.LeadgerDetailRepository;
import com.cjc.disbursment.repository.LeadgerMonthlyUpdateRepository;
import com.cjc.disbursment.repository.LedgerDetRepo;
import com.cjc.disbursment.repository.LedgerMonthRepo;
import com.cjc.disbursment.repository.LoanCaseRepo;
import com.cjc.disbursment.repository.LoanDetailsRepo;
import com.cjc.disbursment.repository.PDFCustomerRepository;
import com.cjc.disbursment.repository.SanctionDetailRepo;
import com.cjc.disbursment.repository.SubDealerRepo;
import com.cjc.disbursment.repository.TenureRepo;
import com.cjc.disbursment.repository.VehicleRepo;

@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	BankRepo br;
	@Autowired
	CibilRepo cr;
	@Autowired
	CustomerRepo cur;
	@Autowired
	DealerRepo dr;
	@Autowired
	DisbCreationRepo dcr;
	@Autowired
	Disbleadgerrepo dlr;
	@Autowired
	EmiRepo er;
	@Autowired
	GuarantorRepo gr;
	@Autowired
	LedgerDetRepo ldr;
	@Autowired
	LedgerMonthRepo lmr;
	@Autowired
	LoanCaseRepo lcr;
	@Autowired
	LoanDetailsRepo ldsr;
	@Autowired
	SanctionDetailRepo sncr;
	@Autowired
	SubDealerRepo sdr;
	@Autowired
	TenureRepo tr;
	@Autowired
	VehicleRepo vr;
	@Autowired
	CaseNumberRepository cnr;
	@Autowired
	private com.cjc.disbursment.repository.DisbursmentRepository disbursmentRepository;
	
	
    @Autowired
    PDFCustomerRepository customerRepository;

	@Autowired
	private DisbursmentLeadgerRepository disbursmentleadgerRepository;
	
	@Autowired
	private LeadgerDetailRepository leadgerDetailRepository;
	
	@Autowired
	private LeadgerMonthlyUpdateRepository leadgerMonthlyUpdateRepository;
	
	//public static final Logger logger=(Logger) org.apache.log4j.Logger.getLogger(BankController.class);
	
	@Override
	public Bank addBank(Bank b) {
		System.out.println("inside service!");
		Bank bn=br.save(b);
		return bn;
	}

	/*
	 * @Override public CibilScore addcbil(CibilScore c) { // TODO Auto-generated
	 * method stub System.out.println("inside service!"); CibilScore cs=cr.save(c);
	 * return null; }
	 */

	@Override
	public Customer addCust(Customer cust) {
		System.out.println("inside service!");
		// TODO Auto-generated method stub
		Customer c1=cur.save(cust);
		return c1;
	}

	@Override
	public Dealer addDeal(Dealer d) {
		// TODO Auto-generated method stub
		System.out.println("inside service!");
		Dealer dl=dr.save(d);
		return dl;
	}

	@Override
	public DisbursmentCreation addDcr(DisbursmentCreation dc) {
		// TODO Auto-generated method stub
		System.out.println("inside service!");
		DisbursmentCreation d=dcr.save(dc);
		return d;
	}

	@Override
	public DisbursmentLeadgerDetails adddl(DisbursmentLeadgerDetails dl) {
		// TODO Auto-generated method stub
		System.out.println("inside service!");
		DisbursmentLeadgerDetails d=dlr.save(dl);
		return d;
	}

	@Override
	public EMIDetails addEmi(EMIDetails ed) {
		// TODO Auto-generated method stub
		System.out.println("inside service!");
		EMIDetails e=er.save(ed);
		return e;
	}

	@Override
	public GurrenterDetails addGui(GurrenterDetails gd) {
		// TODO Auto-generated method stub
		System.out.println("inside service!");
		GurrenterDetails g=gr.save(gd);
		return g;
	}

	@Override
	public LedgerDetail addLed(LedgerDetail ld) {
		// TODO Auto-generated method stub
		System.out.println("inside service!");
		LedgerDetail l=ldr.save(ld);
		return l;
	}

	@Override
	public LedgerMonthlydetails addLedMonthly(LedgerMonthlydetails ldm) {
		// TODO Auto-generated method stub
		System.out.println("inside service!");
		LedgerMonthlydetails lm=lmr.save(ldm);
		return lm;
	}

	@Override
	public LoanCase adaLoan(LoanCase lc) {
		// TODO Auto-generated method stub
		System.out.println("inside service!");
		LoanCase l=lcr.save(lc);
		return l;
	}

	@Override
	public LoanDetails addLoanDetail(LoanDetails ld) {
		// TODO Auto-generated method stub
		System.out.println("inside service!");
		LoanDetails l=ldsr.save(ld);
		return l;
	}

	@Override
	public SanctionLetter addSanction(SanctionLetter sc) {
		// TODO Auto-generated method stub
		System.out.println("inside service!");
		SanctionLetter sl=sncr.save(sc);
		return sl;
	}

	@Override
	public SubDealer addsubd(SubDealer sb) {
		// TODO Auto-generated method stub
		System.out.println("inside service!");
		return null;
	}

	@Override
	public Tenure addTenu(Tenure tn) {
		// TODO Auto-generated method stub
		System.out.println("inside service!");
		Tenure t=tr.save(tn);
		return t;
	}

	@Override
	public VehicleDetails addvehicle(VehicleDetails vd) {
		// TODO Auto-generated method stub
		System.out.println("inside service!");
		VehicleDetails v=vr.save(vd);
		return v;
	}

	@Override
	public Cibil addcbil(Cibil c) {
		// TODO Auto-generated method stub
		Cibil c1=cr.save(c);
		return c1;
	}
	@Override
	public CaseNumber addCasen(CaseNumber cn)
	{
		CaseNumber c=cnr.save(cn);
		return c;
	}

	@Override
	public Disbursment addDisbursment(Disbursment disbursment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DisbursmentLeadger addDisbursmentLeadgerDetail(DisbursmentLeadger disbursmentLeadgerDetail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LedgerDetail addLeadgerDetail(LedgerDetail leadgerDetail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LedgerMonthlydetails addLeadgerMonthlyUpdateData(LedgerMonthlydetails ledgerMonthlydetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DisbursmentLeadger getDisbursmentLeadgerDetail(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDisbursmentLeadger(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDisbursmentLeadger(DisbursmentLeadger disbursmentLeadgerDetail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Disbursment getDisbursment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDisbursment(Disbursment disbursment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDisbursment(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LedgerDetail getLeadgerDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateLeadgerDetails(LedgerDetail ledgerDetail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLeadgerDetails(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LedgerMonthlydetails getLeadgerMonthlyupdate(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateLeadgerMonthlyupdate(LedgerMonthlydetails ledgerMonthlydetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLeadgerMonthlyupdate(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DisbursmentLeadger> getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Disbursment> getAllDisbursmentData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LedgerDetail> getAllLeadgerDetailData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByPDFId(int id) {
		
		return null;
	}
	
	
	/*
	 * @Override public Optional<Bank> getBankById(int bid) {
	 * logger.info("inside service"); Optional<Bank>bl=br.findById(bid);
	 * logger.info(bl); return bl; }
	 */
	@Override
	public Optional<Bank> getBankById(int bid)
	{
		//logger.info("inside service");
		System.out.println("inside service!");
		Optional<Bank>bl=br.findById(bid);
		System.out.println(bl);
		return bl;
		
	}

}
