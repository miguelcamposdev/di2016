<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Students extends CI_Controller {

	public function __construct()
  {
  	parent::__construct();
		//$this->load->helper('url');
  }

	public function index()
	{
		$this->load->view('welcome_message');
	}

	public function lista() {
		// importamos el fichero models/Students_model.php
		$this->load->model('students_model');
		$estudiantes_array = $this->students_model->get_listado_estudiantes();

		//---------------   Cargo la vista 'commons/header.php'  ------------- /
		$datos = array(
			'title' => "Estudiantes" // En la vista 'header' tendré una variable $title
		);
		$this->load->view('commons/header',$datos);

		//---------------   Cargo la vista 'lista_estudiantes.php'  ------------- /
		$datos_cuerpo = array(
			'estudiantes' => $estudiantes_array // en la vista 'lista_estudiantes' tendré una variable $estudiantes
		);
		$this->load->view('lista_estudiantes',$datos_cuerpo);

		//---------------   Cargo la vista 'commons/footer.php'  ------------- /
		$this->load->view('commons/footer');
	}

	public function add() {
		echo "Estás en la página de añadir un estudiante";
	}
}
