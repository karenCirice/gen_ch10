<<<<<<< HEAD
// Wow
var Wow = function() {
    "use strict";

    // Handle Wow
    var handleWow = function() {
        var wow = new WOW({
		    boxClass:     'wow',      // animated element css class (default is wow)
		    offset:       0,          // distance to the element when triggering the animation (default is 0)
		    mobile:       false,      // trigger animations on mobile devices (true is default)
		    tablet:       false       // trigger animations on tablet devices (true is default)
		});
		wow.init();
    }

    return {
        init: function() {
            handleWow(); // initial setup for counter
        }
    }
}();

$(document).ready(function() {
    Wow.init();
=======
// Wow
var Wow = function() {
    "use strict";

    // Handle Wow
    var handleWow = function() {
        var wow = new WOW({
		    boxClass:     'wow',      // animated element css class (default is wow)
		    offset:       0,          // distance to the element when triggering the animation (default is 0)
		    mobile:       false,      // trigger animations on mobile devices (true is default)
		    tablet:       false       // trigger animations on tablet devices (true is default)
		});
		wow.init();
    }

    return {
        init: function() {
            handleWow(); // initial setup for counter
        }
    }
}();

$(document).ready(function() {
    Wow.init();
>>>>>>> 27c570dba6e7cb488f6c21813cccc0a92fb98942
});