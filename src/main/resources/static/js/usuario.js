import {showEstados,showMunicipios,showColonias} from './promesas.js';

let $selectPais = document.getElementById("select-pais");
let $selectEstado = document.getElementById("select-estado");
let $selectMunicipio = document.getElementById("select-municipio");
let $selectColonia = document.getElementById("select-colonia");

$selectPais.addEventListener('change',()=>{
   let optionValuePais = $selectPais.options[$selectPais.selectedIndex];
   estadosShow(optionValuePais.value);
});

$selectEstado.addEventListener('change',()=>{
   let optionValueEstado = $selectEstado.options[$selectEstado.selectedIndex];
   municipiosShow(optionValueEstado.value)
});

$selectMunicipio.addEventListener('change',()=>{
   let optionValueMunicipio = $selectMunicipio.options[$selectMunicipio.selectedIndex];
   coloniasShow(optionValueMunicipio.value)
});

//Para el llenado del combo colonias
let coloniasShow = (idMunicipio) =>{

   for (let option = $selectColonia.options.length; option >= 1; option--){
      $selectColonia.remove(option);
   }

   showColonias(idMunicipio).then(colonias =>{

      for (const key in colonias){

         let coloniaOption = document.createElement("option");
         coloniaOption.value = colonias[key].idColonia;
         coloniaOption.text = colonias[key].colonia;
         $selectColonia.appendChild(coloniaOption);
      }
   }).catch(() =>{
      console.log("Algo salio mal colonias");
   });
}

//Para el llenado del combo estados
let estadosShow = (paisId) =>{

   for (let option = $selectEstado.options.length; option >= 1; option--){
      $selectEstado.remove(option);
   }

   showEstados(paisId).then(estados =>{

      for (const key in estados){

         let estadoOption = document.createElement("option");
         estadoOption.value = estados[key].idEstado;
         estadoOption.text = estados[key].estado;
         $selectEstado.appendChild(estadoOption);
      }
   }).catch(() =>{
      console.log("Algo salio mal estados");
   });
}

//Para el llenado del combo muncipios
let municipiosShow = (estadoId) =>{

   for (let option = $selectMunicipio.options.length; option >= 1; option--){
      $selectMunicipio.remove(option);
   }

   showMunicipios(estadoId).then(municipios =>{

      for (const key in municipios){

         let municipioOption = document.createElement("option");
         municipioOption.value = municipios[key].idMunicipio;
         municipioOption.text = municipios[key].municipio;
         $selectMunicipio.appendChild(municipioOption);
      }

   }).catch(()=>{
      console.log("Algo salio mal municipios");
   });
}


