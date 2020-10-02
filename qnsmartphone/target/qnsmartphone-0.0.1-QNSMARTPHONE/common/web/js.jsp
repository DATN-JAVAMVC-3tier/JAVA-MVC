<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- COMMON SCRIPTS -->
<script src="template/web/js/jquery-2.2.4.min.js"></script>
<script src="template/web/js/common_scripts.js"></script>
<script src="template/web/assets/validate.js"></script>
<script src="template/web/js/header_sticky_1.js"></script>
<script src="template/web/js/functions.js"></script>

<!-- LayerSlider script files -->
<script src="template/web/layerslider/js/greensock.js"></script>
<script src="template/web/layerslider/js/layerslider.transitions.js"></script>
<script
	src="template/web/layerslider/js/layerslider.kreaturamedia.jquery.js"></script>
<script src="template/web/js/slider_func.js"></script>
<!-- SPECIFIC SCRIPTS -->
<script>
	if ($('.prod-tabs .tab-btn').length) {
		$('.prod-tabs .tab-btn').on('click', function(e) {
			e.preventDefault();
			var target = $($(this).attr('href'));
			$('.prod-tabs .tab-btn').removeClass('active-btn');
			$(this).addClass('active-btn');
			$('.prod-tabs .tab').fadeOut(0);
			$('.prod-tabs .tab').removeClass('active-tab');
			$(target).fadeIn(500);
			$(target).addClass('active-tab');
		});

	}
</script>