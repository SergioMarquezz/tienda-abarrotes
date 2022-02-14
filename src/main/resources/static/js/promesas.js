import {urlServiciosLocal} from "./configuracion.js";

//Consumo del servicio rest para estados
export let showEstados = (idPais) => {

    let urlEstados = urlServiciosLocal+"/estados/buscarByPais/"+idPais;

    return new Promise(function (resolve,reject){
        let peticion = new XMLHttpRequest();
        peticion.open('GET',urlEstados);

        peticion.onload = function (){
            if (peticion.status === 200){
                resolve(
                    JSON.parse(peticion.response)
                )
            }
            else{
                reject();
            }
        };
        peticion.send();
    });
}
//Consumo del servicio rest para muncipios
export let showMunicipios = (idEstado) =>{

    let urlMunicipios = urlServiciosLocal+"/municipios/buscarByEstado/"+idEstado;

    return new Promise(function (resolve,reject){
        let peticion = new XMLHttpRequest();
        peticion.open('GET',urlMunicipios);

        peticion.onload = function (){
            if (peticion.status === 200){
                resolve(
                    JSON.parse(peticion.response)
                )
            }
            else{
                reject();
            }
        };
        peticion.send();
    });
}
//Consumo del servicio rest para colonias
export let showColonias = (idMunicipio) =>{

    let urlColonias = urlServiciosLocal+"/colonias/buscarByMuncipio/"+idMunicipio;

    return new Promise(function (resolve,reject){
        let peticion = new XMLHttpRequest();
        peticion.open('GET',urlColonias);

        peticion.onload = function (){
            if (peticion.status === 200){
                resolve(
                    JSON.parse(peticion.response)
                )
            }
            else{
                reject();
            }
        };
        peticion.send();
    });
}
