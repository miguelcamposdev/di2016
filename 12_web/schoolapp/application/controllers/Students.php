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
		$this->load->view('lista_estudiantes');
	}

	public function add() {
		echo "Estás en la página de añadir un estudiante";
	}
}
