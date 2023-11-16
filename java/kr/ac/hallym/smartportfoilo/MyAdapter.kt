package kr.ac.hallym.smartportfoilo

import android.content.Context
import android.graphics.Color
import android.graphics.Rect
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
//
import kr.ac.hallym.smartportfoilo.databinding.OneFragementItemBinding
import kr.ac.hallym.smartportfoilo.databinding.ThreeFragmentItemBinding
import kr.ac.hallym.smartportfoilo.databinding.TwoFragmentItemBinding

class MyViewHolder(val binding: OneFragementItemBinding): RecyclerView.ViewHolder(binding.root)
class MyViewHolder2(val binding: TwoFragmentItemBinding): RecyclerView.ViewHolder(binding.root)
class MyViewHolder3(val binding: ThreeFragmentItemBinding):RecyclerView.ViewHolder(binding.root)
//class MyViewHolder4(val binding: CardLayoutBinding): RecyclerView.ViewHolder(binding.root)


class MyAdapter (val contents:MutableList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyViewHolder(OneFragementItemBinding.inflate(LayoutInflater.from(parent.context),
            parent, false))




    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as MyViewHolder).binding

    }

    override fun getItemCount(): Int {
        return contents.size
    }
}


class MyAdapter2 (val contents:MutableList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyViewHolder2(TwoFragmentItemBinding.inflate(LayoutInflater.from(parent.context),
                parent, false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as MyViewHolder2).binding

    }

    override fun getItemCount(): Int {
        return contents.size
    }
}
class MyAdapter3 (val contents:MutableList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyViewHolder3(
            ThreeFragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as MyViewHolder3).binding

    }


    override fun getItemCount(): Int {
        return contents.size
    }

}





//    class MyDecoration(val context: Context) : RecyclerView.ItemDecoration() {
//        override fun getItemOffsets(
//            outRect: Rect,
//            view: View,
//            parent: RecyclerView,
//            state: RecyclerView.State
//        ) {
//            super.getItemOffsets(outRect, view, parent, state)
//            val index = parent.getChildAdapterPosition(view) + 1
//            if (index % 3 == 0)
//                outRect.set(10, 10, 10, 60)
//            else
//                outRect.set(10, 10, 10, 0)
//            view.setBackgroundColor(Color.parseColor("#28A0FF"))
//            ViewCompat.setElevation(view, 20.0f)
//        }
//    }
