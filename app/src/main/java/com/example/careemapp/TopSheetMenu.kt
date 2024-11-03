
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.DialogFragment
import com.example.careemapp.MainActivity
import com.example.careemapp.R
import com.example.careemapp.databinding.BottomSheetMenuBinding


class TopMenuDialogFragment : DialogFragment() {

    private var _binding: BottomSheetMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = BottomSheetMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Close button listener
        binding.closeButton.setOnClickListener {
            dismiss()
        }

        // Set up navigation listeners
        binding.homeButton.setOnClickListener {
            (activity as? MainActivity)?.navigateToHome(view)
            dismiss()
        }

        /*binding.profileButton.setOnClickListener {
            (activity as? MainActivity)?.navigateToProfile(view)
            dismiss()
        }

        binding.activityButton.setOnClickListener {
            (activity as? MainActivity)?.navigateToActivities(view)
            dismiss()
        }*/

        binding.helpButton.setOnClickListener {
            (activity as? MainActivity)?.navigateToHelp(view)
            dismiss()
        }
    }

    override fun onStart() {
        super.onStart()
        // Make the dialog appear at the top
        dialog?.window?.apply {
            setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            setGravity(Gravity.TOP)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


