function doCheck1(){ //1������ֵ     0���󱾽�  2���������� 3�����������
		
  		var numP=$("#numP").val();
  		var numI=$("#numI").val();
  		var numN=$("#numN").val();
  	
  		//��ֵ������������ : ������֧��С��
  		var regm2 = /^[0-9]+(\.?[0-9]+)?$/;
  		//�������ޣ�������
  		var regm3 = /^[1-9]+(\.?[0-9]+)?$/;
  		if(numP==null||numP.trim()==""){
   			alert("����д:����");
   			return false;
   		}else if (numI!="" && !numI.match(regm2) ){
		     alert("����ӦΪ�����������������룡");
		     return false;
		} 
  		if(numI==null||numI.trim()==""){
   			alert("����д:������");
   			return false;
   		}else if (numI!="" && !numI.match(regm2) ){
		     alert("������ӦΪ���֣������������룡");
		     return false;
		} 
  		if(numN==null||numN.trim()==""){
   			alert("����д:��������");
   			return false;
   		}else if (numN!="" && !numN.match(regm3) ){
		     alert("��������ӦΪ�������������������룡");
		     return false;
		}
   		return true;
  	}
  	function doCheck0(){ //1������ֵ     0���󱾽�  2���������� 3�����������
  		
  	  		var numI=$("#numI").val();
  	  		var numN=$("#numN").val();
  	  		var numF=$("#numF").val();
  	  		//��ֵ������������ : ������֧��С��
  	  		var regm2 = /^[0-9]+(\.?[0-9]+)?$/;
  	  		//�������ޣ�������
  	  		var regm3 = /^[1-9]+(\.?[0-9]+)?$/;

  	  		if(numI==null||numI.trim()==""){
  	   			alert("����д:������");
  	   			return false;
  	   		}else if (numI!="" && !numI.match(regm2) ){
  			     alert("������ӦΪ���֣������������룡");
  			     return false;
  			} 
  	  		if(numN==null||numN.trim()==""){
  	   			alert("����д:��������");
  	   			return false;
  	   		}else if (numN!="" && !numN.match(regm3) ){
  			     alert("��������ӦΪ�������������������룡");
  			     return false;
  			}
  	  		if(numF==null||numF.trim()==""){
  	   			alert("����д:��������");
  	   			return false;
  	   		}else if (numF!="" && !numF.match(regm2) ){
  			     alert("��ֵӦΪ�������������������룡");
  			     return false;
  			}
  	   		return true;
  	  	}
  	function doCheck2(){ //1������ֵ     0���󱾽�  2���������� 3�����������
  		
	  		var numP=$("#numP").val();
	  		var numN=$("#numN").val();
	  		var numF=$("#numF").val();
	  		//��ֵ������������ : ������֧��С��
	  		var regm2 = /^[0-9]+(\.?[0-9]+)?$/;
	  		//�������ޣ�������
	  		var regm3 = /^[1-9]+(\.?[0-9]+)?$/;

	  		if(numP==null||numP.trim()==""){
	   			alert("����д:������");
	   			return false;
	   		}else if (numP!="" && !numP.match(regm2) ){
			     alert("������ӦΪ���֣������������룡");
			     return false;
			} 
	  		if(numN==null||numN.trim()==""){
	   			alert("����д:��������");
	   			return false;
	   		}else if (numN!="" && !numN.match(regm3) ){
			     alert("��������ӦΪ�������������������룡");
			     return false;
			}
	  		if(numF==null||numF.trim()==""){
	   			alert("����д:��������");
	   			return false;
	   		}else if (numF!="" && !numF.match(regm2) ){
			     alert("��ֵӦΪ�������������������룡");
			     return false;
			}
	   		return true;
	  	}
	  	
	  	function doCheck3(){ //1������ֵ     0���󱾽�  2���������� 3�����������
  		
	  		var numP=$("#numP").val();
	  		var numI=$("#numI").val();
	  		var numF=$("#numF").val();
	  		//��ֵ������������ : ������֧��С��
	  		var regm2 = /^[0-9]+(\.?[0-9]+)?$/;

	  		if(numP==null||numP.trim()==""){
	   			alert("����д:������");
	   			return false;
	   		}else if (numP!="" && !numP.match(regm2) ){
			     alert("������ӦΪ���֣������������룡");
			     return false;
			} 
	  		if(numI==null||numI.trim()==""){
	   			alert("����д:��������");
	   			return false;
	   		}else if (numI!="" && !numI.match(regm2) ){
			     alert("��������ӦΪ�������������������룡");
			     return false;
			}
	  		if(numF==null||numF.trim()==""){
	   			alert("����д:��������");
	   			return false;
	   		}else if (numF!="" && !numF.match(regm2) ){
			     alert("��ֵӦΪ�������������������룡");
			     return false;
			}
	   		return true;
	  	}