$("#reset").click(function(){ 

	    $(".resize").val("");
	    //alert("hello");
	});
$("#button").click(function(){ 

	    var cid=$("#cid").val();
	    var name=$("#name").val();
	    var price=$("#price").val();
	    var speed=$("#speed").val();
	    var color=$("#color").val();
	    var mileage=$("#mileage").val();
		if($.isNumeric(cid))
		  {
			$.ajax({
				url:"../cardetails",
				data:{'carId':cid,'carName':name, 'carPrice':price, 'carColor':color, 'carSpeed':speed, 'carMileage':mileage},
				success:function(response,status){
				 alert("Data SuccessFully Saved In Database...");
				  $(".resize").val("");

					/*if(response['carName'].match("null")){
						alert("Car ID "+cid+" Is Not Exist In Database..!!")
					}
					else{
					$("#carId").text(response['carId']);
					$("#carName").text(response['carName']);
					$("#carPrice").text(response['carPrice']);
					$("#carColor").text(response['carColor']);
					$("#carSpeed").text(response['carSpeed']);
				}*/
				},
				error:function(){
					alert("Error is Occure Try Again later....");
				}
			});	
		}
		else{
			alert("Please Enter Car Number In Digits !!");
			$("#cid").val("");
		}
		});