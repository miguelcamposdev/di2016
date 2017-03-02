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
		$this->load->view('commons/header');
		$this->load->view('dashboard');
		$this->load->view('commons/footer');
	}

	public function users()
	{
		$this->load->view('commons/header');
		$this->load->view('users');
		$this->load->view('commons/footer');
	}



}
