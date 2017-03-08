<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Courses extends CI_Controller {

	public function __construct()
  {
  	parent::__construct();
		$this->load->database();
		$this->load->helper('url');
		$this->load->library('grocery_CRUD');
  }

	public function index()
	{
		try{
			$crud = new grocery_CRUD();

			// Tema CSS que se encuentra en el directorio
			// assets/grocery_crud/themes/...
			$crud->set_theme('flexigrid');
			$crud->set_table('Curso');
			$crud->set_subject('Cursos Salesianos Triana');
			// Listado de campos obligatorios, de la tabla Curso
			$crud->required_fields('nombre');
			// A Continuación, escribo los nombres de los
			// campos de la tabla Curso que quiero que se muestren
			// en la vista que se va a generar.
			$crud->columns('id','nombre');

			$output = $crud->render();

			$datos_header = array(
				'title' => "Estudiantes", // En la vista 'header' tendré una variable $title
				'username' => "pepito"
			);
			//$this->load->view("commons/header",$datos_header);
			$this->load->view("example",(array)$output);
			//$this->load->view("commons/footer");

		}catch(Exception $e){
			show_error($e->getMessage().' --- '.$e->getTraceAsString());
		}
	}


}
