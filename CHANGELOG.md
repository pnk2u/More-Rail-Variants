<!--publish=false-->
### 1.0.6:
- Fix inconsistency with vanilla behavior of _Powered_/_Activator Rails_ (including _Oak_) being able to transfer their powered state to each other regardless of type
  > Powered/Activator Rails were incorrectly able to power each other whereas in vanilla only Rails of the same type can power each other,  
  > i.e. only Powered Rails can power other Powered Rails and only Activator Rails can power other Activator Rails.  
  > Now there are two new block tags: `quad-mstv-mrailv:all_powered_rails` and `quad-mstv-mrailv:all_activator_rails` and only Rails within the same tag can power each other.