
'use strict'
// modal
function crearMenu(html) {
    window.onload = () => {
        //$("#navbarSupportedContent").html(html);
        document.getElementById("navbarSupportedContent").innerHTML = html;
    }
}

function mostrarPassword() {
    var pass = document.getElementById("password");
    if (pass.type == "password") {
        pass.type = "text";
        $('.icon').removeClass('fa fa-eye-slash').addClass('fa fa-eye');
    } else {
        pass.type = "password";
        $('.icon').removeClass('fa fa-eye').addClass('fa fa-eye-slash');
    }
}

function mostrarPassword1() {
    var pass = document.getElementById("password1");
    if (pass.type == "password") {
        pass.type = "text";
        $('.icon1').removeClass('fa fa-eye-slash').addClass('fa fa-eye');
    } else {
        pass.type = "password";
        $('.icon1').removeClass('fa fa-eye').addClass('fa fa-eye-slash');
    }
}
function mostrarPassword2() {
    var pass = document.getElementById("password2");
    if (pass.type == "password") {
        pass.type = "text";
        $('.icon2').removeClass('fa fa-eye-slash').addClass('fa fa-eye');
    } else {
        pass.type = "password";
        $('.icon2').removeClass('fa fa-eye').addClass('fa fa-eye-slash');
    }
}

function nobackbutton() {
    window.location.hash = "no-back-button";
    window.location.hash = "Again-No-back-button" //chrome
    window.onhashchange = function () {
        window.location.hash = "no-back-button";
    }
}


function LoadingSpinner(form, spinnerHTML) {
    form = form || document
    var button
    var spinner = document.createElement('div')
    spinner.innerHTML = spinnerHTML
    spinner = spinner.firstChild
    form.addEventListener('click', start)
    form.addEventListener('invalid', stop, true)
    function start(event) {
        if (button)
            stop()
        button = event.target
        if (button.type === 'submit') {
            LoadingSpinner.start(button, spinner)
        }
    }

    function stop() {
        LoadingSpinner.stop(button, spinner)
    }

    function destroy() {
        stop()
        form.removeEventListener('click', start)
        form.removeEventListener('invalid', stop, true)
    }
    return {start: start, stop: stop, destroy: destroy}
}

LoadingSpinner.start = function (element, spinner) {
    element.classList.add('loading')
    return element.appendChild(spinner)
}

LoadingSpinner.stop = function (element, spinner) {
    element.classList.remove('loading')
    return spinner.remove()
}

let loginForm = document.getElementById('loginForm');
let loginLoader = new LoadingSpinner(loginForm, 'Cargando...');

// capcha
function enabledSubmit() {
    var botonSubmit = document.getElementById("submit");
    botonSubmit.disabled = false;
}


// inicializar datatable de jquery

//$(document).ready
$(() => {
    $('#tablaDatos').DataTable({
        scrollY: "230px",
        scrollCollapse: false,
        paging: true,
        searching: true,
        info: true,
        ordering: true
    });
    
});

function checkPasswordMatch(fieldConfirmPassword) {
    if (fieldConfirmPassword.value != document.getElementById("password").value) {
        fieldConfirmPassword.setCustomValidity("Passwords no coinciden!");
    } else {
        fieldConfirmPassword.setCustomValidity("");
    }
}

function getXhr() {
    if (window.XMLHttpRequest) {
        return new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        return new ActiveXObject("Microsoft.XMLHTTP");
    }
}

function editarPerfil() {
    var URLdomain = "http://" + window.location.host;
    let xhr = getXhr();
    var userNamePerfil = document.getElementById("userNamePerfil").value;
    xhr.open("GET", URLdomain + "/inmes/usuario/editarPerfil/" + userNamePerfil, true);
    xhr.onreadystatechange = () => {
        if (xhr.readyState == 4 && xhr.status == 200) {
            let data = xhr.responseText;
            console.log(data);
            document.getElementById("perfilModalHolder").innerHTML = data;
            $("#perfilModal").modal();
        }
    }
    xhr.send(null);
}

function showAsignarInmueble(){
    $("#asignarInmuebleModal").modal();
}

function searchInmueble() {
    var claveArea = document.getElementById("claveArea").value;
    var noUsuario = document.getElementById("noUsuario").value;
    console.log("../../usuarios/searchInmueble/" + claveArea + "/" + noUsuario);
    if (claveArea != "" && noUsuario != 0) {
        var xhr = getXhr();
        xhr.open("GET", "../../usuarios/searchInmueble/" + claveArea + "/" + noUsuario, true);
        xhr.onreadystatechange = () => {
            if (xhr.readyState === 4 && xhr.status === 200) {
                let data = xhr.responseText;
                console.log(data);
                document.getElementById("datosInmuebles").innerHTML = data;
            }
        }
        xhr.send(null);
    }
}

function listCentrosTrabajoInmueble(){
    var inmuebleAsignado = document.getElementById("inmuebleAsignado").value;
    console.log(inmuebleAsignado);
    if (inmuebleAsignado != 0) {
        var xhr = getXhr();
        xhr.open("GET", "../../usuarios/listCentrosTrabajoInmueble/" + inmuebleAsignado, true);
        xhr.onreadystatechange = () => {
            if (xhr.readyState === 4 && xhr.status === 200) {
                let data = xhr.responseText;
                console.log(data);
                document.getElementById("centrosTrabajoDeInmuebleModalHolder").innerHTML = data;
                $("#centrosTrabajoDeInmuebleModal").modal();
            }
        }
        xhr.send(null);
}
}



function sumartotal(val) {
    	
    var buenoEducativo = document.getElementById('buenoEducativo_'+val).value;
    var regularEducativo = document.getElementById('regularEducativo_'+val).value;
    var maloEducativo = document.getElementById('maloEducativo_'+val).value;
    var naEducativo = document.getElementById('naEducativo_'+val).value;
    
    var buenoProvisionales = document.getElementById('buenoProvisionales_'+val).value;
    var regularProvisionales = document.getElementById('regularProvisionales_'+val).value;
    var maloProvisionales = document.getElementById('maloProvisionales_'+val).value;
    var naProvisionales = document.getElementById('naProvisionales_'+val).value;
    
    var buenoAdaptados = document.getElementById('buenoAdaptados_'+val).value;
    var regularAdaptados = document.getElementById('regularAdaptados_'+val).value;
    var maloAdaptados = document.getElementById('maloAdaptados_'+val).value;
    var naAdaptados = document.getElementById('naAdaptados_'+val).value;
    
    var buenoFueraInmueble = document.getElementById('buenoFueraInmueble_'+val).value;
    var regularFueraInmueble = document.getElementById('regularFueraInmueble_'+val).value;
    var maloFueraInmueble = document.getElementById('maloFueraInmueble_'+val).value;
    var naFueraInmueble = document.getElementById('naFueraInmueble_'+val).value;
    
    buenoEducativo = (buenoEducativo == null || buenoEducativo == undefined || buenoEducativo == "") ? 0 : buenoEducativo;
    regularEducativo = (regularEducativo == null || regularEducativo == undefined || regularEducativo == "") ? 0 : regularEducativo;
    maloEducativo = (maloEducativo == null || maloEducativo == undefined || maloEducativo == "") ? 0 : maloEducativo;
    naEducativo = (naEducativo == null || naEducativo == undefined || naEducativo == "") ? 0 : naEducativo;
    
    buenoProvisionales = (buenoProvisionales == null || buenoProvisionales == undefined || buenoProvisionales == "") ? 0 : buenoProvisionales;
    regularProvisionales = (regularProvisionales == null || regularProvisionales == undefined || regularProvisionales == "") ? 0 : regularProvisionales;
    maloProvisionales = (maloProvisionales == null || maloProvisionales == undefined || maloProvisionales == "") ? 0 : maloProvisionales;
    naProvisionales = (naProvisionales == null || naProvisionales == undefined || naProvisionales == "") ? 0 : naProvisionales;
    
    buenoAdaptados = (buenoAdaptados == null || buenoAdaptados == undefined || buenoAdaptados == "") ? 0 : buenoAdaptados;
    regularAdaptados = (regularAdaptados == null || regularAdaptados == undefined || regularAdaptados == "") ? 0 : regularAdaptados;
    maloAdaptados = (maloAdaptados == null || maloAdaptados == undefined || maloAdaptados == "") ? 0 : maloAdaptados;
    naAdaptados = (naAdaptados == null || naAdaptados == undefined || naAdaptados == "") ? 0 : naAdaptados;
    
    buenoFueraInmueble = (buenoFueraInmueble == null || buenoFueraInmueble == undefined || buenoFueraInmueble == "") ? 0 : buenoFueraInmueble;
    regularFueraInmueble = (regularFueraInmueble == null || regularFueraInmueble == undefined || regularFueraInmueble == "") ? 0 : regularFueraInmueble;
    maloFueraInmueble = (maloFueraInmueble == null || maloFueraInmueble == undefined || maloFueraInmueble == "") ? 0 : maloFueraInmueble;
    naFueraInmueble = (naFueraInmueble == null || naFueraInmueble == undefined || naFueraInmueble == "") ? 0 : naFueraInmueble;
    
    
    var totalEducativo = parseInt(buenoEducativo) + parseInt(regularEducativo) + parseInt(maloEducativo) + parseInt(naEducativo);
    var totalProvisionales = parseInt(buenoProvisionales) + parseInt(regularProvisionales) + parseInt(maloProvisionales) + parseInt(naProvisionales);
    var totalAdaptados = parseInt(buenoAdaptados) + parseInt(regularAdaptados) + parseInt(maloAdaptados) + parseInt(naAdaptados);
    var totalFueraInmueble = parseInt(buenoFueraInmueble) + parseInt(regularFueraInmueble) + parseInt(maloFueraInmueble) + parseInt(naFueraInmueble);
    
    totalEducativo = (totalEducativo == null || totalEducativo == undefined || totalEducativo == "") ? 0 : totalEducativo;
    totalProvisionales = (totalProvisionales == null || totalProvisionales == undefined || totalProvisionales == "") ? 0 : totalProvisionales;
    totalAdaptados = (totalAdaptados == null || totalAdaptados == undefined || totalAdaptados == "") ? 0 : totalAdaptados;
    totalFueraInmueble = (totalFueraInmueble == null || totalFueraInmueble == undefined || totalFueraInmueble == "") ? 0 : totalFueraInmueble;
    
    var totalBuenos = parseInt(buenoEducativo) + parseInt(buenoProvisionales) + parseInt(buenoAdaptados) + parseInt(buenoFueraInmueble);
    var totalRegulares = parseInt(regularEducativo) + parseInt(regularProvisionales) + parseInt(regularAdaptados) + parseInt(regularFueraInmueble);
    var totalmalos = parseInt(maloEducativo) + parseInt(maloProvisionales) + parseInt(maloAdaptados) + parseInt(maloFueraInmueble);
    var totalNas = parseInt(naEducativo) + parseInt(naProvisionales) + parseInt(naAdaptados) + parseInt(naFueraInmueble);
    
    var totalTotal = parseInt(totalBuenos) + parseInt(totalRegulares) + parseInt(totalmalos) + parseInt(totalNas);
    
    totalBuenos = (totalBuenos == null || totalBuenos == undefined || totalBuenos == "") ? 0 : totalBuenos;
    totalRegulares = (totalRegulares == null || totalRegulares == undefined || totalRegulares == "") ? 0 : totalRegulares;
    totalmalos = (totalmalos == null || totalmalos == undefined || totalmalos == "") ? 0 : totalmalos;
    totalNas = (totalNas == null || totalNas == undefined || totalNas == "") ? 0 : totalNas;
    
    totalTotal = (totalTotal == null || totalTotal == undefined || totalTotal == "") ? 0 : totalTotal;
    
    document.getElementById('totalEducativo_'+val).value = totalEducativo;
    document.getElementById('totalProvisionales_'+val).value = totalProvisionales;
    document.getElementById('totalAdaptados_'+val).value = totalAdaptados;
    document.getElementById('totalFueraInmueble_'+val).value = totalFueraInmueble;
    
    document.getElementById('totalBuenos_'+val).value = totalBuenos;
    document.getElementById('totalRegulares_'+val).value = totalRegulares;
    document.getElementById('totalmalos_'+val).value = totalmalos;
    document.getElementById('totalNas_'+val).value = totalNas;
    
    document.getElementById('totalTotal_'+val).value = totalTotal;
}