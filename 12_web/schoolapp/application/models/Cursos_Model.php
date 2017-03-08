<?php

class Cursos_Model extends CI_Model {

      public function __construct()
          {
                  parent::__construct();
                  // Your own constructor code
                  $this->load->database();
          }

        public function get_listado_cursos()
        {
                // SELECT * FROM Curso
                $query = $this->db->get('Curso');
                return $query->result();
        }

        public function get_curso($idCurso)
        {
                // SELECT * FROM Estudiantes WHERE id='$idEstudiante'
                $this->db->where('id',$idCurso);
                $query = $this->db->get('Curso');
                return $query->row();
        }


}
