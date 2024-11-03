/*
package com.example.careemapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.MaterialCalendarView
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener
import java.util.Calendar

class SelectDepartureTimeFragment : Fragment() {

    private lateinit var selectedDateTextView: TextView
    private lateinit var calendarView: MaterialCalendarView
    private lateinit var timePicker: TimePicker
    private lateinit var confirmDateTimeButton: View

    private var selectedDate: CalendarDay? = null
    private var selectedHour = 0
    private var selectedMinute = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_select_departure_time, container, false)

        selectedDateTextView = view.findViewById(R.id.selectedDateTextView)
        calendarView = view.findViewById(R.id.calendarView)
        timePicker = view.findViewById(R.id.timePicker)
        confirmDateTimeButton = view.findViewById(R.id.confirmDateTimeButton)

        // Set up calendar date selection
        calendarView.setOnDateChangedListener(OnDateSelectedListener { _, date, _ ->
            selectedDate = date
            updateSelectedDateTimeDisplay()
        })

        // Set up time picker
        timePicker.setOnTimeChangedListener { _, hourOfDay, minute ->
            selectedHour = hourOfDay
            selectedMinute = minute
            updateSelectedDateTimeDisplay()
        }

        // Confirm button click
        confirmDateTimeButton.setOnClickListener {
            if (selectedDate != null) {
                Toast.makeText(requireContext(), "Date and Time confirmed", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Please select a date", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }

    private fun updateSelectedDateTimeDisplay() {
        if (selectedDate != null) {
            val calendar = Calendar.getInstance()
            calendar.set(selectedDate!!.year, selectedDate!!.month - 1, selectedDate!!.day, selectedHour, selectedMinute)

            val dayOfWeek = android.text.format.DateFormat.format("EEEE", calendar).toString()
            val dateString = android.text.format.DateFormat.format("dd MMMM yyyy", calendar).toString()
            val timeString = android.text.format.DateFormat.format("hh:mm a", calendar).toString()

            selectedDateTextView.text = "$dayOfWeek, $dateString · $timeString"
        }
    }
}
*/
