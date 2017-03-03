<?php

class Students_Model extends CI_Model {

      public function __construct()
          {
                  parent::__construct();
                  // Your own constructor code
                  $this->load->database();
          }

        public function get_listado_estudiantes()
        {
                // SELECT * FROM Estudiantes LIMIT 10
                $query = $this->db->get('Estudiantes', 10);

                // $estudiantes
                // foreach($estudiantes as $est) { $est->telefono }
                return $query->result();

                // $estudiantes
                // foreach($estudiantes as $est) { $est['telefono'] }
                //return $query->result_array();
        }

        public function get_student($idEstudiante)
        {
                // SELECT * FROM Estudiantes WHERE id='$idEstudiante'
                $this->db->where('id',$idEstudiante);
                $query = $this->db->get('Estudiantes');

                // $estudiante
                // $estudiante->telefono
                // row() sólo devuelve una fila, no un array
                return $query->row();


        }


}
