function doCheck1(){ //1是求终值     0是求本金  2是求年利率 3是求存入年限
		
  		var numP=$("#numP").val();
  		var numI=$("#numI").val();
  		var numN=$("#numN").val();
  	
  		//终值、本金、年利率 : 正数、支持小数
  		var regm2 = /^[0-9]+(\.?[0-9]+)?$/;
  		//存入年限：正整数
  		var regm3 = /^[1-9]+(\.?[0-9]+)?$/;
  		if(numP==null||numP.trim()==""){
   			alert("请填写:本金");
   			return false;
   		}else if (numI!="" && !numI.match(regm2) ){
		     alert("本金应为正数，检查后重新输入！");
		     return false;
		} 
  		if(numI==null||numI.trim()==""){
   			alert("请填写:年利率");
   			return false;
   		}else if (numI!="" && !numI.match(regm2) ){
		     alert("年利率应为数字，检查后重新输入！");
		     return false;
		} 
  		if(numN==null||numN.trim()==""){
   			alert("请填写:存入年限");
   			return false;
   		}else if (numN!="" && !numN.match(regm3) ){
		     alert("存入年限应为正整数，检查后重新输入！");
		     return false;
		}
   		return true;
  	}
  	function doCheck0(){ //1是求终值     0是求本金  2是求年利率 3是求存入年限
  		
  	  		var numI=$("#numI").val();
  	  		var numN=$("#numN").val();
  	  		var numF=$("#numF").val();
  	  		//终值、本金、年利率 : 正数、支持小数
  	  		var regm2 = /^[0-9]+(\.?[0-9]+)?$/;
  	  		//存入年限：正整数
  	  		var regm3 = /^[1-9]+(\.?[0-9]+)?$/;

  	  		if(numI==null||numI.trim()==""){
  	   			alert("请填写:年利率");
  	   			return false;
  	   		}else if (numI!="" && !numI.match(regm2) ){
  			     alert("年利率应为数字，检查后重新输入！");
  			     return false;
  			} 
  	  		if(numN==null||numN.trim()==""){
  	   			alert("请填写:存入年限");
  	   			return false;
  	   		}else if (numN!="" && !numN.match(regm3) ){
  			     alert("存入年限应为正整数，检查后重新输入！");
  			     return false;
  			}
  	  		if(numF==null||numF.trim()==""){
  	   			alert("请填写:存入年限");
  	   			return false;
  	   		}else if (numF!="" && !numF.match(regm2) ){
  			     alert("终值应为正整数，检查后重新输入！");
  			     return false;
  			}
  	   		return true;
  	  	}
  	function doCheck2(){ //1是求终值     0是求本金  2是求年利率 3是求存入年限
  		
	  		var numP=$("#numP").val();
	  		var numN=$("#numN").val();
	  		var numF=$("#numF").val();
	  		//终值、本金、年利率 : 正数、支持小数
	  		var regm2 = /^[0-9]+(\.?[0-9]+)?$/;
	  		//存入年限：正整数
	  		var regm3 = /^[1-9]+(\.?[0-9]+)?$/;

	  		if(numP==null||numP.trim()==""){
	   			alert("请填写:年利率");
	   			return false;
	   		}else if (numP!="" && !numP.match(regm2) ){
			     alert("年利率应为数字，检查后重新输入！");
			     return false;
			} 
	  		if(numN==null||numN.trim()==""){
	   			alert("请填写:存入年限");
	   			return false;
	   		}else if (numN!="" && !numN.match(regm3) ){
			     alert("存入年限应为正整数，检查后重新输入！");
			     return false;
			}
	  		if(numF==null||numF.trim()==""){
	   			alert("请填写:存入年限");
	   			return false;
	   		}else if (numF!="" && !numF.match(regm2) ){
			     alert("终值应为正整数，检查后重新输入！");
			     return false;
			}
	   		return true;
	  	}
	  	
	  	function doCheck3(){ //1是求终值     0是求本金  2是求年利率 3是求存入年限
  		
	  		var numP=$("#numP").val();
	  		var numI=$("#numI").val();
	  		var numF=$("#numF").val();
	  		//终值、本金、年利率 : 正数、支持小数
	  		var regm2 = /^[0-9]+(\.?[0-9]+)?$/;

	  		if(numP==null||numP.trim()==""){
	   			alert("请填写:年利率");
	   			return false;
	   		}else if (numP!="" && !numP.match(regm2) ){
			     alert("年利率应为数字，检查后重新输入！");
			     return false;
			} 
	  		if(numI==null||numI.trim()==""){
	   			alert("请填写:存入年限");
	   			return false;
	   		}else if (numI!="" && !numI.match(regm2) ){
			     alert("存入年限应为正整数，检查后重新输入！");
			     return false;
			}
	  		if(numF==null||numF.trim()==""){
	   			alert("请填写:存入年限");
	   			return false;
	   		}else if (numF!="" && !numF.match(regm2) ){
			     alert("终值应为正整数，检查后重新输入！");
			     return false;
			}
	   		return true;
	  	}