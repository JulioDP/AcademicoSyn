package com.example.academicosync.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.academicosync.databinding.FragmentDashboardBinding
import com.example.academicosync.ui.home.CategoriaAdapter
import com.example.academicosync.ui.home.CursoProvider

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerTutoria = binding.recycleTutoria
        //val recyclerViewCAtegorias = finViewByid<RecyclerView>(R.id.recyclerCategorias)
        recyclerTutoria.layoutManager = LinearLayoutManager(requireContext())
        recyclerTutoria.adapter = TutoriasAdapter(TutoriasProvider.listTutoria)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}