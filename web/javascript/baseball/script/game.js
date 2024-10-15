	window.onload = function() {
		document.getElementById("ball1").focus();
	
		var btnHtml = "";
		
		for (var i = 1; i < 10; i++) {
			btnHtml += ('<button value="'+i+'" class="btn'+i+'" id="btn'+i+'" > '
					+ i + '</button>');
		}
		document.getElementById("btnarea").innerHTML = btnHtml;
		
		//숫자버튼이벤트 발생
		for(var i=1;i<10;i++){
			var btn = document.getElementById("btn" + i);
			btn.addEventListener("click", function(){
				player.buttonPush(this.value);
			});
		}
		
		//클리어버튼 이벤트 발생
		var clear = document.getElementById("clear");
		clear.addEventListener("click", function(){
			player.clean();
		})
		
		
		//리셋버튼 이벤트 발생
		var reset = document.getElementById("reset");
		reset.addEventListener("click", function(){
			refree.reset();
		})
		
		var test = document.getElementById("test");
		var aa = "";
		while(refree.ball.length < 3){			
			var n = Math.floor(Math.random() * 9) +1;
			if(refree.ball.indexOf(n) == -1){				
				refree.ball.push(n);
				aa += n + " ";				
			}			
		}
		
		test.innerHTML = aa;
		
		
	}
	
	var refree = {
			ball : [],
			strikecount : 0,
			ballcount : 0,				
			result : '',
			count : 0,
			
			//스트라크, 볼체크
			check : function(){
				ballArr = [player.ball1, player.ball2, player.ball3];	
				//alert(ballArr[0] +" " + ballArr[1] + " " +ballArr[2]);
				//alert(refree.ball[0] +" " + refree.ball[1] + " " + refree.ball[2]);
				for(var i=0;i<ballArr.length;i++){
					if(refree.ball[i] == ballArr[i]){
						refree.strikecount++;
						
					}
				}
				
				for(var i=0;i<ballArr.length;i++){
					if(refree.ball[i] == ballArr[(i+1)%3]){
						refree.ballcount++;
					}else if(refree.ball[i] == ballArr[(i+2)%3]){
						refree.ballcount++;
					}
				}			
			},//end check
			
			
			reset : function(){
				refree.count = "1";
				refree.result = "";
				
				refree.ball.pop();
				refree.ball.pop();
				refree.ball.pop();
				
				while(refree.ball.length < 3){			
					var n = Math.floor(Math.random() * 9) +1;
					if(refree.ball.indexOf(n) == -1){				
						refree.ball.push(n);
					}
				}
				
				document.getElementById("ball1").value = "";
				document.getElementById("ball2").value = "";
				document.getElementById("ball3").value = "";
				document.getElementById("result").innerHTML = "";
				document.getElementById("ball1").focus();
				document.getElementById("count").innerHTML = refree.count + "차";
				document.getElementById("clear").disabled = false;
				
			},
			
		
			print: function(){			
				refree.result += player.ball1 + " " + player.ball2 + " "
					+ player.ball3 + " => " + refree.strikecount + "Strike!!  "
					+ refree.ballcount + "Ball!! \n";
				document.getElementById("result").innerHTML = refree.result;
				
				refree.game();
			},
			
			game: function(){
				if(refree.strikecount == 3){
					refree.result += "축하합니다. 경기에 이기셨습니다.!!";
					document.getElementById("result").innerHTML = refree.result;
					refree.strikecount = 0;
					refree.ballcount = 0;
					alert("승리하셨습니다.");
					document.getElementById("clear").disabled = true;
					
				}else if(refree.count == 10){
					refree.result = "You Lose!! 다시 시작해주세요.";
					document.getElementById("result").innerHTML = refree.result;
					refree.strikecount = 0;
					refree.ballcount = 0;
					document.getElementById("clear").disabled = true;
				}			
			}
		}
	
	
	
	var player = {
			ball1 : 0,
			ball2 : 0,
			ball3 : 0,
			
			//버튼클릭 핸들러
			buttonPush : function(clicked_value){
				player.ball1 = document.getElementById("ball1").value;
				player.ball2 = document.getElementById("ball2").value;
				player.ball3 = document.getElementById("ball3").value;
				
				if(player.ball1 == ''){
					document.getElementById("ball1").value = clicked_value;
					document.getElementById("ball2").focus();
				}else if(player.ball2 == ''){
					document.getElementById("ball2").value = clicked_value;
					document.getElementById("ball3").focus();
				}else if(player.ball3 == ''){
					document.getElementById("ball3").value = clicked_value;
					player.ball3 = document.getElementById("ball3").value;
					refree.check();
					refree.print();
				}
				refree.strikecount = 0;
				refree.ballcount = 0;
				
			},//end buttonPush
		
			//번호판 클리어
			clean : function(){			
				document.getElementById("ball1").value="";
				document.getElementById("ball2").value="";
				document.getElementById("ball3").value="";
				document.getElementById("ball1").focus();
				refree.count++;
				document.getElementById("count").innerHTML = refree.count + "차";
			}
				
		};
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	