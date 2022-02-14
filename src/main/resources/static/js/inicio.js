document.addEventListener('DOMContentLoaded',()=>{
    categoriaProductos();
});

function categoriaProductos(){

    let $tabsCategorias = document.getElementsByClassName("tabs-categorias");
    let totalTabs = $tabsCategorias.length;

     for (let i = 0; i < totalTabs; i++){

        let etiquetaTab = "tab"+(i+1);
        let $divCategorias = document.getElementById(etiquetaTab);

         $divCategorias.addEventListener('click',()=>{

            let classActive = $divCategorias.classList.contains('active');

             if (classActive){
                 $divCategorias.classList.remove('active');
             }
         })
    }

}