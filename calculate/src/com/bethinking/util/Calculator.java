package com.bethinking.util;
import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com. bethinking.model.Record;

@Component("calculator")
public class Calculator{
	
	private int scaleOfDeleve=10; 
	private Record record;
	String answer;
	String numP;
	String numI;
	String numN;
	String numF;
	BigDecimal bP;
	BigDecimal bI;
	BigDecimal bN;
	BigDecimal bF;                //1单利  2复利
	int calculateWay=1;//0是求本金   1是求终值   2是求年利率 3求存入年限                  默认是0
	
	public Record calculate(Record record){
		this.record = record;
		selectCalculateBlock();
		return returnRecord();
	}
	
	public Record returnRecord(){
		// 0是求本金 1是求终值 2是求年利率 3求存入年限
				// 1单利 2复利
		if (record.getCalculateWay()==1) {
			record.setNumF(answer);
		} else if (record.getCalculateWay()==2) {
			record.setNumI(answer);
		} else if (record.getCalculateWay()==3) {
			record.setNumN(answer);
		} else if (record.getCalculateWay()==4) {
			record.setNumP(answer);
		} else {
			record.setNumP(answer);
		}
		return record;
	}
	
	public String selectCalculateBlock(){
		if(1==record.getCalculateBlock()){
			this.answer = simpleCalculate(record.getNumP(),record.getNumI(),record.getNumN(),record.getNumF(),record.getCalculateWay());
			return this.answer;
		}else if(2==record.getCalculateBlock()){
			this.answer = compoundCalculate(record.getNumP(),record.getNumI(),record.getNumN(),record.getNumF(),record.getCalculateWay());
			return answer;
		}else{
			return null;
		}
	}

	public void getBigDecimal(String numP,String numI,String numN,String numF,int way){
	
		this.calculateWay=way;

		
		if(this.calculateWay==0){
			this.numF=numF.trim();
			bF=new BigDecimal(this.numF);
			this.numI=numI.trim();
			this.numN=numN.trim();
			bI=new BigDecimal(this.numI);
			bN=new BigDecimal(this.numN);
		}else if(this.calculateWay==4){
			this.numF=numF.trim();
			bF=new BigDecimal(this.numF);
			this.numI=numI.trim();
			this.numN=numN.trim();
			bI=new BigDecimal(this.numI);
			bN=new BigDecimal(this.numN);
		}else if(this.calculateWay==2){
			this.numN=numN.trim();
			bN=new BigDecimal(this.numN);
			this.numF=numF.trim();
			bF=new BigDecimal(this.numF);
			this.numP=numP.trim();
			bP=new BigDecimal(this.numP);
		}else if(this.calculateWay==3){
			this.numI=numI.trim();
			bI=new BigDecimal(this.numI);
			this.numF=numF.trim();
			bF=new BigDecimal(this.numF);
			this.numP=numP.trim();
			bP=new BigDecimal(this.numP);
		}else{
			this.numP=numP.trim();
			bP=new BigDecimal(this.numP);
			this.numN=numN.trim();
			bN=new BigDecimal(this.numN);
			this.numI=numI.trim();
			bI=new BigDecimal(this.numI);
		}
	}

	public String  simpleCalculate(String numP,String numI,String numN,String numF,int way){	
		getBigDecimal(numP,numI,numN,numF,way);
			if(this.calculateWay==1){
				this.bF=this.bP.multiply(new BigDecimal("1").add(   this.bI.multiply(this.bN)          )       );
				//numF=numP*(1+numI*numN);
				return this.bF.toBigInteger().toString();
			}else if(this.calculateWay==2){
				this.bI=this.bF.divide(this.bP,this.scaleOfDeleve,BigDecimal.ROUND_HALF_UP ).subtract(new BigDecimal("1")).divide(this.bN,this.scaleOfDeleve,BigDecimal.ROUND_HALF_UP );
				//numI=(numF/numP-1)/numN;
				return this.bI.toBigInteger().toString();
			}else if(this.calculateWay==3){
				this.bN=this.bF.divide(this.bP,this.scaleOfDeleve,BigDecimal.ROUND_HALF_UP ).subtract(new BigDecimal("1")).divide(this.bI,this.scaleOfDeleve,BigDecimal.ROUND_HALF_UP );
				return this.bN.toBigInteger().toString();
				//numN=(numF/numP-1)/numI;
			}else{
				this.bP=this.bF.divide(new BigDecimal("1").add(   this.bI.multiply(this.bN)          ) ,this.scaleOfDeleve,BigDecimal.ROUND_HALF_UP      );
				//numP=numF/(numN*numI+1);
				return this.bP.toBigInteger().toString();
			}
	}
public String  compoundCalculate(String numP,String numI,String numN,String numF,int way){	
		getBigDecimal(numP,numI,numN,numF,way);
			if(this.calculateWay==1){
				this.bF=bI.add(new BigDecimal("1")).pow(Integer.valueOf(bN.toString())).multiply(bP);
				//numF=numP*Math.pow((1+numI),numN);
				return this.bF.toBigInteger().toString();
			}else if(this.calculateWay==2){
				BigDecimal numF_divide_numP=bF.divide(bP,this.scaleOfDeleve,BigDecimal.ROUND_HALF_UP);
				double pow1=Double.valueOf(numF_divide_numP.toString());
				double pow2=Double.valueOf(bN.toString());
				this.bI = new BigDecimal(Math.pow(pow1,1.0/pow2)-1);
				//numI=Math.pow((numF/numP),1/numN)-1;
				return this.bI.toBigInteger().toString();
			}else if(this.calculateWay==3){
				Double numN1=Math.log(Double.valueOf(this.bF.toString())/Double.valueOf(this.bP.toString()))/Math.log(1+Double.valueOf(this.bI.toString()));
				this.bN = new BigDecimal(numN1.toString());
				//numN=Math.log(numF/numP)/Math.log(1+numI);
				return this.bN.toBigInteger().toString();
			}else if(this.calculateWay==4){ 
				//BigDecimal num5=this.bP.multiply(new BigDecimal("1").add(this.bI.divide(new BigDecimal("12"))).pow(Integer.valueOf(this.bN.subtract(new BigDecimal("12")).toString()))).multiply(this.bI.divide(new BigDecimal("12"))).divide(new BigDecimal("1").add(this.bI.divide(new BigDecimal("12"))).pow(Integer.valueOf(this.bN.subtract(new BigDecimal("12")).toString())).subtract(new BigDecimal("1")));
				double numi=this.bI.doubleValue();
				double numn=this.bN.doubleValue();
				double numf=this.bF.doubleValue();
				double nump=numf*Math.pow((1+numi/12),numn*12)*(numi/12)/(Math.pow((1+numi/12),numn*12)-1);
				return String.valueOf(nump);
				//等额还款=numP*Math.pow((1+numI/12),numN*12)*(numI/12)/(Math.pow((1+numI/12),numN*12)-1);
			}else{
				this.bP=this.bF.divide(    bI.add(new BigDecimal("1")).pow(Integer.valueOf(bN.toString())),this.scaleOfDeleve,BigDecimal.ROUND_HALF_UP);
				//numP=numF/Math.pow((1+numI),numN);
				return this.bP.toBigInteger().toString();
			}
	}
}
