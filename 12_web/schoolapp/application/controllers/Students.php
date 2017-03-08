<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Students extends CI_Controller {

	public function __construct()
  {
  	parent::__construct();
		$this->load->model('students_model');
		$this->load->model('cursos_model');
  }

	public function index()
	{
		$this->lista();
	}

	public function lista() {
		// importamos el fichero models/Students_model.php
		$estudiantes_array = $this->students_model->get_listado_estudiantes();

		//---------------   Cargo la vista 'commons/header.php'  ------------- /
		$datos = array(
			'title' => "Estudiantes", // En la vista 'header' tendré una variable $title
			'username' => "pepito"
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

	public function edit($idEstudiante) {
		$nombre = $this->input->post('inputNombre');

		if($nombre==NULL) {

			//---------------   Cargo la vista 'commons/header.php'  ------------- /
			$datos = array(
				'title' => "Estudiantes", // En la vista 'header' tendré una variable $title
				'username' => "pepito"
			);
			$this->load->view('commons/header',$datos);

			//---------------   Cargo la vista 'lista_estudiantes.php'  ------------- /
			$estudianteSolicitado = $this->students_model->get_student($idEstudiante);
			$arrayCursos = $this->cursos_model->get_listado_cursos();
			$datos_cuerpo = array(
				'estudiante' => $estudianteSolicitado,
				'cursos' => $arrayCursos
			);
			$this->load->view('edit_estudiante',$datos_cuerpo);

			//---------------   Cargo la vista 'commons/footer.php'  ------------- /
			$this->load->view('commons/footer');

		} else {
				$apellidos = $this->input->post("inputApellidos");
				$telefono = $this->input->post("inputTelefono");
				$id = $this->input->post("idE");
				$cursoSeleccionado = $this->input->post("selectCurso");

				$est = array(
					'id' => $id,
					'nombre' => $nombre,
					'apellidos' => $apellidos,
					'telefono' => $telefono
				);

				$this->students_model->edit_estudiante($est);

				redirect('students/lista/');
		}
	}

	public function editajax() {
		$idE = $this->get("id");

		$estudiante = $this->students_model->get_student($idE);

		echo $estudiante->nombre." ".$estudiante->apellidos;
	}
}
