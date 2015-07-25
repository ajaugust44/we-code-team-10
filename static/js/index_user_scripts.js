(function()
{
 "use strict";
 /*
   hook up event handlers 
 */
 function register_event_handlers()
 {
    
    
     /* button  .uib_w_4 */
    
    
        /* button  .uib_w_4 */
    $(document).on("click", ".uib_w_4", function(evt)
    {
         /* Other possible functions are: 
           uib_sb.open_sidebar($sb)
           uib_sb.close_sidebar($sb)
           uib_sb.toggle_sidebar($sb)
            uib_sb.close_all_sidebars()
          See js/sidebar.js for the full sidebar API */
        
         uib_sb.toggle_sidebar($(".uib_w_2"));  
    });
    
        /* button  Logic */
    
    
        /* button  Array */
    $(document).on("click", ".uib_w_14", function(evt)
    {
         activate_subpage("#logic_page"); 
    });
    
        /* button  Logic */
    $(document).on("click", ".uib_w_12", function(evt)
    {
         activate_subpage("#logic_page"); 
    });
    
    }
 document.addEventListener("app.Ready", register_event_handlers, false);
})();
