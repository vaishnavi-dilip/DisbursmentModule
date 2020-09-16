package com.cjc.disbursment.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class IRRCOntroller
{	
	public static double getIRR(final double[] cashflows)
	{
		final int MAX_ITER=30;
		double EXCEL_EPSILON=0.00000001;
		double x=0.1;
		int iter=0;
		while(iter++ < MAX_ITER)
		{
			final double x1=1.0+x;
			double fx=0.0;
			double dfx=0.0;
			for(int i=0;i<cashflows.length;i++)
			{
				final double v=cashflows[i];
				final double x1_i=Math.pow(x1, i);
				fx +=v/x1_i;
				final double x1_i1=x1_i*x1;
				dfx +=-i*v/x1_i1;
				
			}
			final double new_x=x-fx/dfx;
			final double epsilon=Math.abs(new_x-x);
			if(epsilon <= EXCEL_EPSILON)
			{
				if(x==0.0 && Math.abs(new_x)<=EXCEL_EPSILON)
				{
					return 0.0;
				}else
				{
					return new_x*100;
					
				}
			}
			x=new_x;
		}
		
		
		return x;
		
	}

}

	


