$(function(){	
	$('.quantity input').change(function(){
		var totalCost = 0;
		var totalQuanity = 0;
		
		$('table tbody tr').each(function(index){
			var price = parseFloat($(this).find('.price').text().replace(/^[^\d.]/, ''));
			price = isNaN(price) ? 0 : price;
			
			var quantity = parseInt($(this).find('.quantity input').val());
			quantity = isNaN(quantity) ? 0 : quantity;
			
			var cost = price * quantity;
			$(this).find('.cost').text('$' + cost.toFixed(2));
			
			totalCost += cost;
			totalQuanity += quantity;		
			
		});
		
		$('.subtotal .cost').text('$' + totalCost.toFixed(2));
		$('.shipping .quantity').text(totalQuanity);		
		
		var tax = parseInt($('.tax .price').text()) / 100;
		var taxCost = totalCost * tax;
		
		$('.tax .cost').text('$' + taxCost.toFixed(2));
		
		var shippingPrice = parseInt($('.shipping .price').text().replace(/^[^\d.]/, ''));
		var shippingCost = totalQuanity * shippingPrice;
		
		$('.shipping .cost').text('$' + shippingCost);
		
		var finalTotal = totalCost + taxCost + shippingCost;
		
		$('.total .cost').text('$' + finalTotal.toFixed(2));
	});
});



