<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Dashboard extends CI_Controller {

	public function __construct()
  {
  	parent::__construct();
		//$this->load->helper('url');
  }

	public function index()
	{

		$datos = array(
			'title' => "Dashboard"
		);

		$this->load->view('commons/header',$datos);
		$this->load->view('dashboard');
		$this->load->view('commons/footer');
	}

	public function users()
	{
		$datos = array(
			'title' => "Users"
		);

		$this->load->view('commons/header',$datos);
		$this->load->view('users');
		$this->load->view('commons/footer');
	}



}
