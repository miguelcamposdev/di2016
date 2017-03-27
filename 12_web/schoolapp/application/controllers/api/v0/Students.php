<?php

defined('BASEPATH') OR exit('No direct script access allowed');

// This can be removed if you use __autoload() in config.php OR use Modular Extensions
/** @noinspection PhpIncludeInspection */
require APPPATH . '/libraries/REST_Controller.php';

// use namespace
use Restserver\Libraries\REST_Controller;

/**
 * This is an example of a few basic user interaction methods you could use
 * all done with a hardcoded array
 *
 * @package         CodeIgniter
 * @subpackage      Rest Server
 * @category        Controller
 * @author          Phil Sturgeon, Chris Kacerguis
 * @license         MIT
 * @link            https://github.com/chriskacerguis/codeigniter-restserver
 */
class Students extends REST_Controller {

    public function lista_get()
    {
      $this->load->model('students_model');
      $estudiantes_array = $this->students_model->get_listado_estudiantes();

      // La siguiente línea de código devuelvo en formato
      // JSON el listado de estudiantes de la base de datos_cuerpo
      // dando como código de respuesta 200
      $this->set_response($estudiantes_array, REST_Controller::HTTP_OK);
    }

    public function one_get()
    {
      $this->load->model('students_model');
      // obtengo el parámetro que recibo en la petición
      // GET con nombre 'id'
      $idEst = $this->get('id');
      $estudiante = $this->students_model->get_student($idEst);

      // La siguiente línea de código devuelvo en formato
      // JSON el estudiante de la base de datos_cuerpo
      // dando como código de respuesta 200
      if($estudiante==null) {
          $this->set_response(array('mensaje'=>"Estudiante no encontrado con id = ".$idEst), REST_Controller::HTTP_NOT_FOUND);
      } else {
      $this->set_response($estudiante, REST_Controller::HTTP_OK);
      }
    }

    public function login_post() {
      $this->load->model('ion_auth_model');
      $this->load->model('students_model');

      $email = $this->input->post("e");
      $pass = $this->input->post("p");

      $usuario = $this->students_model->get_user_by_email($email);
      $login = $this->ion_auth_model->hash_password_db($usuario->id,$pass);

      if($login == TRUE) {
        $this->set_response(array(
        'status' => "success",
        'data' => $usuario,
        'mensaje'=>"Login correcto"
        ), REST_Controller::HTTP_OK);
      } else {
        $this->set_response(
          array(
          'status' => "error",
          'data' => null,
          'mensaje'=>"Login incorrecto"
        ), REST_Controller::HTTP_NOT_FOUND);
      }

    }


}
