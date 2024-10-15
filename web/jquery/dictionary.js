//step1
$(function(){
	$('#letter-a a').click(function(){
		$('#dictionary').hide().load('a.html', function(){
			$(this).fadeIn();
		});
		return false;
	});
});

//step2
//$(function(){
//	$('#letter-b a').click(function(){
//		$.getJSON('b.json', function(data){
//			$('#dictionary').empty();
//			//결과값 : 배열 : [{},{}] => HTML
//			$.each(data, function(index, item){
//				var html = '<div class="entry">';
//				html += '<h3 class="term">' + item.term  + '</h3>';
//				html += '<div class="part">' + item.part  + '</div>';
//				html += '<div class="definition">' + item.definition  + '</div>';
//				html += '</div>';
//				
//				$('#dictionary').append(html);
//			});			
//		});
//		
//		return false;
//	});
//});

//step2_1  : getJSON() => ajax() 변환
$(function(){
	$('#letter-b a').click(function(){
		$.ajax({
			url : 'b.json',
			type : 'get',
			dataType : 'json',
			success : function(data){
				$('#dictionary').empty();
				
				data.sort(function(a, b){//내림차순
					if(a.term < b.term){
						return 1;
					}else if(a.term > b.term){
						return -1;
					}else{
						return 0;
					}
				});
				
				$.each(data, function(index, item){
					var html = '<div class="entry">';
					html += '<h3 class="term">' + item.term  + '</h3>';
					html += '<div class="part">' + item.part  + '</div>';
					html += '<div class="definition">' + item.definition  + '</div>';
					html += '</div>';
					
					$('#dictionary').append(html);
				});
			}
		});
	});
});//end main function

//step3
$(function(){
	$('#letter-c a').click(function(){
		$.getScript('c.js');
		
		return false;
	});
});

//step4_1  : get() => ajax() 변환

//step4
$(function(){
	$('#letter-d a').click(function(){
		//xml => HTML변환 => 화면 출력
		$.get('d.xml', function(data){
			$('#dictionary').empty();
			
			$(data).find('entry').each(function(index){
				$entry = $(this);
				var html = '<div class="entry">';
				html += '<h3 class="term">' + $entry.attr('term')  + '</h3>';
				html += '<div class="part">' + $entry.attr('part')   + '</div>';
				html += '<div class="definition">' + $entry.find('definition').text()  + '</div>';
				html += '</div>';
				
				$('#dictionary').append(html);
			});
		});
		
		return false;
	});
});

//step5
$(function(){
	$('#letter-e a').click(function(){
		$.get('server3.jsp', {'term' : $(this).text()}, function(data){
			$('#dictionary').text(data);
		});
		
		return false;
	});
});

//step6
$(function(){
	$('#letter-f form').submit(function(){
		$.ajax({
			url : 'server3.jsp',
			type : 'post',
			data : $(this).serialize(),
			dataType : 'text',
			success : function(data){
				$('#dictionary').text(data);
			}
		});
		return false;
	});
});









